import java.util.Scanner;

public class HackerMultithread {
    public static final int MAX_NUMBER=9999;
    public static void main(String... args){

    }

    //Treasure Class
    private class Treasure{
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
    private abstract class Hacker extends Thread{
        protected Treasure treasure;
        public Hacker(Treasure trr){
            this.treasure= trr;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }

        @Override
        public void start(){
            System.out.println("Starting Thread"+ this.getName());
            super.start();
        }
    }
    private class AscendingHacker extends Hacker{

        public AscendingHacker(Treasure tr) {
            super(tr);
        }

        @Override
        public void run(){
            for(int guess=0; guess<MAX_NUMBER; guess++){
                if(treasure.CorrectPassword(guess)){
                    System.out.println("");
                }
            }
        }

    }

}
