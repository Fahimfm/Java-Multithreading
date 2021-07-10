import java.util.Scanner;

public class HackerMultithread {
    public static void main(String... args){

    }

    //Treasure Class
    public class Treasure{
        private int password;
        public Treasure(int password){
            this.password=password;
        }
        //method
        public boolean CorrectPassword(int guess){
            try{
                Thread.sleep(5);
            }catch (InterruptedException e){
            }
            return this.password==guess;
        }
    }

    //Hacker class
    public class Hacker extends Thread{
        protected Treasure treasure;
    }

}
