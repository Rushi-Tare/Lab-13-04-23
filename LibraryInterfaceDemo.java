package arraysProgram;

//package array;

public interface LibraryUser
{
void registerAccount(int age);
void requestBook(String bookType);
}
package arraysProgram;

class KidUsers implements LibraryUser
{
public void registerAccount1(int age)
{
    if(age<12)
    {
        System.out.println("You have successfully registered under a Kids Account");
    }
    else
    {
        System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }
}

public void requestBook(String bookType){
    if(bookType.equals("Kids"))
    {
        System.out.println("Book Issued successfully, please return the book within 10 days");
    }
    else
    {
    package arraysProgram;

import arrays.AdultUser;

public class KidUser3{
public static void main(String[] args){
//test case 1
	KidUsers kidUser = new KidUsers();
	kidUser.registerAccount(10);
	kidUser.requestBook("Kids");
	kidUser.requestBook("Fiction");
    
	System.out.println();
	
	KidUsers kidUser1 = new KidUsers();
	kidUser1.registerAccount(18);
	kidUser1.requestBook("Kids");
	kidUser1.requestBook("Fiction");
	
	System.out.println();
	
//test case 2
    AdultUser adultUser = new AdultUser();
    adultUser.registerAccount(5);
    adultUser.requestBook("Kids");
    adultUser.requestBook("Fiction");
    
    System.out.println();
    
    AdultUser adultUser1 = new AdultUser();
    adultUser1.registerAccount(23);
    adultUser1.requestBook("Kids");
    adultUser1.requestBook("Fiction");
}
}
