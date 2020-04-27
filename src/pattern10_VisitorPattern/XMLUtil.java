package pattern10_VisitorPattern;

import java.io.File;
import java.lang.reflect.Field;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
		public static Object getBean()
		{
			try
			{
				//创建文档对象
				DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = dFactory.newDocumentBuilder();
				Document doc;							
				doc = builder.parse(new File("F://java-workspace//FactoryDemo//src//pattern10_VisitorPattern//config.xml")); 
				NodeList nl=null;
				Node classNode=null;
				String cName=null;
				nl = doc.getElementsByTagName("className");
				
				
				//获取包含类名的文本节点
		        classNode=nl.item(0).getFirstChild();
		         
		        cName=classNode.getNodeValue();
		        //通过类名生成实例对象并将其返回
		        Class c=Class.forName(cName);
			  	Object obj=c.newInstance();
		        return obj;		
	           }   
	           	catch(Exception e)
	           	{
	           		e.printStackTrace();
	           		return null;
	           	}
			}
}
