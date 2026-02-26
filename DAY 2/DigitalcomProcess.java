package com.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


interface IValidate {
    boolean isAuthenticated(String userid, String password);
}

class User implements IValidate{
	
	private String userid;
	private String password;
	
	public User() {}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void addUser(String userid,String password) {
		this.userid =userid;
		this.password=password;
		
		System.out.println("user registered!!");
	}
	
	public boolean isAuthenticated(String userid,String password) {
		
		if(this.userid != null && this.password != null) {
			return  this.userid.equals(userid) &&  this.password.equals(password);
		}
		return false;
	                       
	}
	
	public String toString() {
		return "User [userid = "+userid+"] ";
	}

//	@Override
//	public boolean isAuthenticated(String userid, String password) {
//		// TODO Auto-generated method stub
//		return false;
//	}
}

class Game {

    private String gameName;
    private String authorName;
    private float price;
    
    public Game() {}
    
    public Game(String gameName, String authorName, float price) {
        this.gameName = gameName;
        this.authorName = authorName;
        this.price = price;
    }

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
    
	public String toString() {
        return "Game Name: " + gameName + ", Author: " + authorName + ", Price: " + price;
                
    }

}


class GameService {

    public static ArrayList<Game> games = new ArrayList<>();

    
    public GameService() {
        games.add(new Game("GTA_5", "Ben", 300));
        games.add(new Game("Ramayan", "Ram", 450));
        games.add(new Game("Miles_Morales", "Katy", 400));
        games.add(new Game("Resident_Evil", "Steve", 600));
        games.add(new Game("Witcher", "Hulk", 350));
    }

    
    public List<Game> viewAll() {
        return games;
    }

    
    public String authorSearch(String author) {
        for (Game g : games) {
            if (g.getAuthorName().equalsIgnoreCase(author)) {
                return g.getGameName();
            }
        }
        return "NOT FOUND";
    }
}

public class DigitalcomProcess {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        User user = new User();
        GameService service = new GameService();

        boolean exit = false;
        boolean isLoggedIn = false;   

        while (!exit) {

            System.out.println("DigitalCom Customer Portal");
            System.out.println("1.Register User");
            System.out.println("2.Login");
            System.out.println("3.View Games");
            System.out.println("4.Search By Author");
            System.out.println("5."
            		+ "Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter UserId: ");
                    String uid = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String pwd = sc.nextLine();
                    user.addUser(uid, pwd);
                    break;

                case 2:
                    System.out.print("Enter UserId: ");
                    String loginId = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String loginPwd = sc.nextLine();

                    if (user.isAuthenticated(loginId, loginPwd)) {
                        isLoggedIn = true;
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Invalid credentials!");
                    }
                    break;

                case 3:
                    if (isLoggedIn) {
                        System.out.println("\nAvailable Games:");
                        for (Game g : service.viewAll()) {
                            System.out.println(g);
                        }
                    } else {
                        System.out.println("Please login to view games.");
                    }
                    break;

                case 4:
                    if (isLoggedIn) {
                        System.out.print("Enter Author Name: ");
                        String author = sc.nextLine();
                        System.out.println("Result: " + service.authorSearch(author));
                    } else {
                        System.out.println("Please login to search games.");
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Thank you for using DigitalCom!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
            
	}

}
