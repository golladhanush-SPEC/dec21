package dhanush;

public class java3 {

	public static void main(String[] args) {
		
		
				//java program to check weather two string are Anagram
				
				//silent
				//listen
				
				Scanner sc = new Scanner(System.in);
				String str1 = sc.next();
				String str2 = sc.next();
				sc. close();
				char each = ' ';
				
				if(str1.length() == str2.length()) {
					for(int i=0;i<str1.length();i++) {
						char eachCh = str1.charAt(i);
						if(isCharThere(str2,eachCh) == false) {
							isAnagram = false;
							break;
							
						}
					}
				}
			}

			private static boolean isCharThere(String str2, char eachCh) {
				// TODO Auto-generated method stub
				return false;
			}

		}