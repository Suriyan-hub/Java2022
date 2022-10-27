package com.multithreading;
//static synchronized
class BookSeat2{
	static int tot_seats=20;
	 static synchronized void bookSeat(int seats) {
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
class MyThread01 extends Thread{
	BookSeat2 b;
    int seats;
    MyThread01(BookSeat2 b,int seats){
    	this.b=b;
    	this.seats=seats;
    }
	public void run() {
		b.bookSeat(seats);
	}
}
class MyThread02 extends Thread{
	BookSeat2 b;
    int seats;
    MyThread02(BookSeat2 b,int seats){
    	this.b=b;
    	this.seats=seats;
    }
	public void run() {
		b.bookSeat(seats);
	}
}
public class SeatBookApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookSeat2 b1=new BookSeat2();
		MyThread01 t1=new MyThread01(b1,7);
		t1.start();
		MyThread02 t2=new MyThread02(b1,6);
		t2.start();
		
		BookSeat2 b2=new BookSeat2();
		MyThread01 t3=new MyThread01(b2,5);
		t3.start();
		MyThread02 t4=new MyThread02(b1,9);
		t4.start();
		
	}

}
