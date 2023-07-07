package BufferandBulider;

public class MethodsOfStringBuffer {

	public static void main(String[] args) {
		
			String s = "Ragul";  
			StringBuffer name = new StringBuffer(s);
			// .append method used for add the numbers or letter or words
			System.out.println("\n Add word :" + name.append(' '));

			System.out.println("Add word :"+name.append("Murugesan"));
			System.out.println("Add word :"+name.append(3));

			// .insert method using for
			// which index to add any numbers or letters or word
			// add in this sentence

			System.out.println("\n Insert word : " + name.insert(8, 13));
			System.out.println("Insert word : " +name.insert(0, "M "));

			// delete method using for
			// which letter are remove to start index and end index

			System.out.println("\n Delete word :" + name.delete(10, 12));
			System.out.println("Delete word :" +name.delete(16, 17));

			// reverse method using for input the sentence
			// reversing the output

			System.out.println("\n Reverse the word : " + name.reverse());
			System.out.println("Reverse the word : " +name.reverse());

			// capacity method used for string to assign stringBuffer then
			// stringBuffer default length 16
			// and String sentence length to adding total then length =(16+ first letter
			// count)
			System.out.println(" length is : "+name.capacity());

			// capacity this method default parameter length is 16
			// then then adding method to using the
			// sum = (old length*2)+2

			StringBuffer n = new StringBuffer();
			System.out.println(" Default method length is : "+n.capacity()); // 16
			n.append("Ragul");
			System.out.println(" Add word length is : "+n.capacity()); // 16
			n.append("Learining the Java");
			System.out.println("Second time word add length is : "+n.capacity()); // (16*2)+2=34
			n.append("Learining the Java");
			System.out.println("Third time word add length is : "+n.capacity());// (34*2)+2=70
			
			// isEmpty method using for input sentence length 0
			// true otherwise false
			System.out.println("\n Length Compare : " + name.isEmpty());
			
			// change to StringBuilder
			String change = name.toString();
			StringBuilder ob = new StringBuilder(change);
			System.out.println("Name :" +ob);

		}

	

}
