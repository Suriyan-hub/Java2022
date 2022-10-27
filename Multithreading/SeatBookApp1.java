package com.multithreading;
//Synchronized block
class BookSeat1{
	int tot_seats=10;
	  void bookSeat(int seats) {
		 System.out.println(Thread.currentThread().getName());
		 System.out.println(Thread.currentThread().getName());
		 System.out.println(Thread.currentThread().getName());
		
		 synchronized(this){
		 if(tot_seats>=seats) {
			System.out.println(seats+"Seats booked sucessfully");
			tot_seats=tot_seats-seats;
			System.out.println("Seats Left:" +tot_seats);
		}
		else {
			System.out.println("Seats cannot be booked");
			System.out.println("Seats Left:" +tot_seats);
		}
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	
	 } 
}
public class SeatBookApp1 extends Thread {

	
		static BookSeat1 b;
	    int seats;
		public void run() {
			b.bookSeat(seats);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			b=new BookSeat1();
			SeatBookApp1 s=new SeatBookApp1();
			s.seats=7;
			s.start();
			
			SeatBookApp1 s1=new SeatBookApp1();
			s1.seats=5;
			s1.start();
			
			
		}
	}


