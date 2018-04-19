/**
 * 
 */
package cheggAugust;

import java.io.File;



import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.DocumentBuilderFactory;



import org.w3c.dom.Document;

import org.w3c.dom.Element;

import org.w3c.dom.Node;

import org.w3c.dom.NodeList;



/**

 *This class will used to parse xml and sum the total cost

 */

public class XMLParserHW7 {



	public static void main(String[] args) {

		//taken cost variable for storing cost

		double cost=0;

		//name of xml file

		String fileName = "hobbies.xml";

		File xmlFile = new File(fileName);

		//using java library 

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder;

		try{

			builder = dbf.newDocumentBuilder();

			//parsing xml file in Document instance

			Document doc = builder.parse(xmlFile);

			doc.getDocumentElement().normalize();

			//root name of XML as per given in file

			NodeList nodeL = doc.getElementsByTagName("Hobby");

			//looping through the nodes of XML file

			for(int i=0;i<nodeL.getLength();i++)

			{

				Node node = nodeL.item(i);

				if(node.getNodeType()==Node.ELEMENT_NODE)

				{

					Element ele = (Element) node;

					//parsing the String value to double 

					//and adding to cost

					//getting the value from XML file with have tag name 

					//have cost as similar way can get value of any tag name

					//please cast as per your requirement

					cost+=Double.parseDouble(ele

							.getElementsByTagName("cost")

							.item(0)

							.getTextContent()) ;

				}

			}

		}

		catch(Exception e)

		{

			System.out.println(e.getMessage());

		}

		//printing the total cost 

		System.out.println("Total Cost = "+cost);

	}

}