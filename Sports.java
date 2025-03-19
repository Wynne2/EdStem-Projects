import java.util.Scanner;

public class Sports {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the first team's name? ");
        String firTeamN= scanner.nextLine();
        System.out.print("What is their score? ");
        int firTeamS = Integer.parseInt(scanner.nextLine());
    System.out.print("What is the second team's name? ");
    String secTeamN = scanner.nextLine();
    System.out.print("What is their score? ");
    int secTeamS= Integer.parseInt(scanner.nextLine());
    if (firTeamS > secTeamS)
    {
        System.out.println(firTeamN + " beat " + secTeamN + " " + firTeamS + " to " + secTeamS + "!");
    }
    else if (firTeamS < secTeamS){
        System.out.println(secTeamN + " beat " + firTeamN + " " + secTeamS + " to " + firTeamS + "!");

    }
    else{
        System.out.println(firTeamN + " ties " + secTeamN + " " + firTeamS + " to " + secTeamS);
    }

    
    }
}
