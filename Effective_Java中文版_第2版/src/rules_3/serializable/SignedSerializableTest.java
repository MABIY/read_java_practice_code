package rules_3.serializable;

import java.io.*;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.security.SignedObject;

/**
 * Created by lh on 17-2-20.
 */
public class SignedSerializableTest {
    /**
     *    如果需要对整个对象进行加密和签名，最简单的是将它放在一个 javax.crypto.SealedObject
     *    或 java.security.SignedObject 包装器中。两者都是可序列化的，所以将对象包装在 SealedObject
     *    中可以围绕原对象创建一种 “包装盒”。必须有对称密钥才能解密，而且密钥必须单独管理。
     *    同样，也可以将 SignedObject 用于数据验证，并且对称密钥也必须单独管理。
     *
     *    这里以SignedObject为例说明
     */

    /**
     * 演示如何对序列化数据进行签名加密
     * @param args
     */
    public static void main(String[] args) throws Throwable{
        SignedPerson signedPerson=new SignedPerson();
        signedPerson.setAge(18);
        signedPerson.setName("zheyuan");
        signedPerson.setNB(false);

        signedSerializableData(signedPerson);
    }

    static void signedSerializableData(Object signedPerson) throws Throwable{
        //-----------第一步：密钥武装序列化类--------------------

        //代做数字签名的原始信息(必须实现Serializable接口)
        Serializable o=(Serializable)signedPerson;
        //实例化KeyPairGenerator(密钥生成器)对象,并指定DSA算法
        KeyPairGenerator keyPairGen=KeyPairGenerator.getInstance("DSA");
        //初始化KeyPairGenerator对象
        int keysize=1024;
        keyPairGen.initialize(keysize);
        //生成KeyPair对象
        KeyPair keyPair=keyPairGen.generateKeyPair();
        //实例化Signature(用来生成和验证数字签名,是一个引擎类)对象
        Signature signature=Signature.getInstance(keyPairGen.getAlgorithm());
        //实例化SignedObject对象
        SignedObject sin=new SignedObject(o,keyPair.getPrivate(),signature);

        //----------第二步：将密钥武装后序列化类SignedObject序列化------------
        OutputStream out=new FileOutputStream("signed_temp");
        ObjectOutputStream oos=new ObjectOutputStream(out);
        oos.writeObject(sin);
        //-----------第三步：SignedObject反序列化-----------------------

        InputStream in=new FileInputStream("signed_temp");
        ObjectInputStream ois=new ObjectInputStream(in);
        SignedObject sout=(SignedObject)ois.readObject();

        //-------------第四步：将原始类信息解密-----------------
        //获得签名值
        Object sign=sout.getObject();
        System.out.println(sign.toString());
        //验证签名
        boolean status=sout.verify(keyPair.getPublic(), signature);
        sout.getObject();
        System.out.println(status);

    }
}
