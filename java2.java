package dhanush;

public class java2 {

	public static void main(String[] args) {
				//check given string is polindrom or not
				//example 13331---yes
				//level----yes
				Scanner sc = new Scanner(System.in);
				System.out.println("enter data");
				String data = sc.next();
				char ch;
				String newstr = "";
				for(int i=data.length()-1;i>=0;i--) {
					ch = data.charAt(i);
					newstr = newstr +ch;
					
				}
				System.out.println("data from keybord---->"+data);
				System.out.println("new Str ----->"+newstr);
				if(data.contentEquals(newstr) == true) {
					System.out.println("polindrom");
					
				}
				else {
					
				}
				
				
				

			}

		}