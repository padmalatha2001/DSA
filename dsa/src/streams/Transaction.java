package streams;

public class Transaction {

	private int id;
	private int uid;
	private double amount;
	private int year;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int id, int uid, double amount, int year) {
		super();
		this.id = id;
		this.uid = uid;
		this.amount = amount;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", uid=" + uid + ", amount=" + amount + ", year=" + year + "]";
	}
	
	
	
}
