package com.multithreading;
//Synchronized Method
class BookSeat{
	int tot_seats=10;
	 synchronized void bookSeat(int seats) {
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
}
public class SeatBookApp extends Thread {
    static BookSeat b;
    int seats;
	public void run() {
		b.bookSeat(seats);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b=new BookSeat();
		SeatBookApp s=new SeatBookApp();
		s.seats=7;
		s.start();
		
		SeatBookApp s1=new SeatBookApp();
		s1.seats=5;
		s1.start();
		
		
	}

}
