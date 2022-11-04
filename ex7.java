//Ex7a
import java.io.*;

class student implements Serializable

{

                String name = "yuva";

                String roll = "023";

}

class ex7c

{

                public static void main(String arg[]) throws Exception

                {

                                File file = new File("filename.txt");

                                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));

                                student s1=new student();

                                oos.writeObject(s1.name);

                                //oos.writeObject(s1.roll);

                                oos.close();

                                ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));

                                student s=(student)ois.readObject();

                                ois.close();

                                System.out.println(s);

                }

}



//ex7b

import java.lang.*;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
class lowercase
{
public static void main(String args[]) throws IOException
{
try
{
FileReader reader = new FileReader("file.txt");
FileWriter writer = new FileWriter("file.txt", true);
int character=' ';
char m;
while ((character = reader.read()) != -1)
{
m=Character.toLowerCase((char)character);
System.out.print(m);
writer.write(m);
}
reader.close();
writer.close();
}
catch (IOException e)
{
e.printStackTrace();
}
}
}



//ex7c



import java.io.*;

class student implements Serializable

{

                String name = "yuva";

                String roll = "023";

}

class ex7c

{

                public static void main(String arg[]) throws Exception

                {

                                File file = new File("file1.txt");

                                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));

                                student s1=new student();

                                oos.writeObject(s1.name);

                                //oos.writeObject(s1.roll);

                                oos.close();

                                /*ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));

                                student s=(student)ois.readObject();

                                ois.close();

                                System.out.println(s);*/

                }

}
