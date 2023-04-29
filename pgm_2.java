// Sort_Book.java
import java.util.*;
public class Sort_Book implements Comparator<book>{
public int compare(book b1, book b2)
{
return (int)(b1.price-b2.price);
}
}
//pgm_2.java
import java.util.*;
class book{
String title,publisher,author;
double price;
book(String title, String publisher, String author, double price){
this.title=title;
this.publisher=publisher;
this.author=author;
this.price=price;
}
void display() {
System.out.println("Title: "+title+" Author: "+author+" Publisher:
"+publisher+" Price: "+price);
}
}
public class pgm_2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
HashMap<Integer,book> hm = new HashMap<Integer,book>();
ArrayList<book> li = new ArrayList<book>();
ArrayList<book> li_2 = new ArrayList<book>();
ArrayList<book> li_3 = new ArrayList<book>();
book b1 = new book("The Alchemist","Pengiun","Paulo Coelo",500);
book b2 = new book("The Winner Stands Alone","Pengiun","Paulo
Coelo",550);
book b3 = new book("2 States","Rupa Publication","Chetan Bhagat",
300);
book b4 = new book("The Jungle Book","Macmillan","Rudyard Kipling",
250);
book b5 = new book("Harry Potter","Bloomsbury","JK Rowling",750);
li.add(b1);
li.add(b2);
li.add(b3);
li.add(b4);
li.add(b5);
hm.put(101,b1);
hm.put(102,b2);
hm.put(103,b3);
hm.put(104,b4);
hm.put(105,b5);
System.out.println("Array List: ");
for(book b:li) {
b.display();
}
System.out.println("\nHashMap: ");
for(Map.Entry<Integer,book> i:hm.entrySet()) {
System.out.print("Id: "+i.getKey()+"--> ");
i.getValue().display();
}
Collections.sort(li,new Sort_Book());
li_2.addAll(li);
System.out.println("\nArray List: After Sorting in Ascending
order wrt to price");
for(book b:li_2) {
b.display();
}
System.out.print("\nWrite an Author's name: ");
String a = sc.nextLine();
for(Map.Entry<Integer,book> i:hm.entrySet()) {
if(i.getValue().author.equals(a)) {
i.getValue().display();
}
}
for(book b:li){
if(b.price>400) {
li_3.add(b);
}
}
System.out.println("\nBooks with price > Rs 400/-");
for(book b:li_3) {
b.display();
}
System.out.print("\nWrite an Publisher's name: ");
String p = sc.nextLine();
for(Map.Entry<Integer,book> i:hm.entrySet()) {
if(i.getValue().publisher.equals(p)) {
i.getValue().display();
}
}
System.out.println("Write full or part of book title");
String t= sc.nextLine();
for(Map.Entry<Integer,book> i:hm.entrySet()) {
if(i.getValue().title.contains(t)) {
i.getValue().display();
}
}
System.out.println("Write full or part of book title for publisher
updation");
String tp= sc.nextLine();
for(Map.Entry<Integer,book> i:hm.entrySet()) {
if(i.getValue().title.contains(tp)) {
System.out.println("Before Updation:-");
i.getValue().display();
System.out.println("After Updation:-");
i.getValue().publisher="Private";
i.getValue().display();
Array List:
Title: The Alchemist Author: Paulo Coelo Publisher: Pengiun Price: 500.0
Title: The Winner Stands Alone Author: Paulo Coelo Publisher: Pengiun Price: 550.0
Title: 2 States Author: Chetan Bhagat Publisher: Rupa Publication Price: 300.0
Title: The Jungle Book Author: Rudyard Kipling Publisher: Macmillan Price: 250.0
Title: Harry Potter Author: JK Rowling Publisher: Bloomsbury Price: 750.0
HashMap:
Id: 101--> Title: The Alchemist Author: Paulo Coelo Publisher: Pengiun Price: 500.0
Id: 102--> Title: The Winner Stands Alone Author: Paulo Coelo Publisher: Pengiun
Price: 550.0
Id: 103--> Title: 2 States Author: Chetan Bhagat Publisher: Rupa Publication
Price: 300.0
Id: 104--> Title: The Jungle Book Author: Rudyard Kipling Publisher: Macmillan
Price: 250.0
Id: 105--> Title: Harry Potter Author: JK Rowling Publisher: Bloomsbury Price:
750.0
Array List: After Sorting in Ascending order wrt to price
Title: The Jungle Book Author: Rudyard Kipling Publisher: Macmillan Price: 250.0
Title: 2 States Author: Chetan Bhagat Publisher: Rupa Publication Price: 300.0
Title: The Alchemist Author: Paulo Coelo Publisher: Pengiun Price: 500.0
Title: The Winner Stands Alone Author: Paulo Coelo Publisher: Pengiun Price: 550.0
Title: Harry Potter Author: JK Rowling Publisher: Bloomsbury Price: 750.0
Write an Author's name: JK Rowling
Title: Harry Potter Author: JK Rowling Publisher: Bloomsbury Price: 750.0
Books with price > Rs 400/-
Title: The Alchemist Author: Paulo Coelo Publisher: Pengiun Price: 500.0
Title: The Winner Stands Alone Author: Paulo Coelo Publisher: Pengiun Price: 550.0
Title: Harry Potter Author: JK Rowling Publisher: Bloomsbury Price: 750.0
Write an Publisher's name: Pengiun
Title: The Alchemist Author: Paulo Coelo Publisher: Pengiun Price: 500.0
Title: The Winner Stands Alone Author: Paulo Coelo Publisher: Pengiun Price: 550.0
Write full or part of book title
Potter
Title: Harry Potter Author: JK Rowling Publisher: Bloomsbury Price: 750.0
Write full or part of book title for publisher updation
2
Before Updation:-
Title: 2 States Author: Chetan Bhagat Publisher: Rupa Publication Price: 300.0
After Updation:-
Title: 2 States Author: Chetan Bhagat Publisher: Private Price: 300.0
Thank You
}
}
System.out.println("Thank You");
}
}
