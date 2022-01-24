package supplier_Details;

public class Supplier {
	
	private int id;
	private String item_name;
	private String item_material;
	private String item_country;
	private String supplier_name;
	private String supplier_email;
	private String supplier_phone;
	private String supplier_address;
	
	
	public Supplier(int id, String item_name, String item_material, String item_country, String supplier_name,
			String supplier_email, String supplier_phone, String supplier_address) {
		super();
		this.id = id;
		this.item_name = item_name;
		this.item_material = item_material;
		this.item_country = item_country;
		this.supplier_name = supplier_name;
		this.supplier_email = supplier_email;
		this.supplier_phone = supplier_phone;
		this.supplier_address = supplier_address;
	}
	
	
	public Supplier(String item_name, String item_material, String item_country, String supplier_name,
			String supplier_email, String supplier_phone, String supplier_address) {
		super();
		this.item_name = item_name;
		this.item_material = item_material;
		this.item_country = item_country;
		this.supplier_name = supplier_name;
		this.supplier_email = supplier_email;
		this.supplier_phone = supplier_phone;
		this.supplier_address = supplier_address;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_material() {
		return item_material;
	}
	public void setItem_material(String item_material) {
		this.item_material = item_material;
	}
	public String getItem_country() {
		return item_country;
	}
	public void setItem_country(String item_country) {
		this.item_country = item_country;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getSupplier_email() {
		return supplier_email;
	}
	public void setSupplier_email(String supplier_email) {
		this.supplier_email = supplier_email;
	}
	public String getSupplier_phone() {
		return supplier_phone;
	}
	public void setSupplier_phone(String supplier_phone) {
		this.supplier_phone = supplier_phone;
	}
	public String getSupplier_address() {
		return supplier_address;
	}
	public void setSupplier_address(String supplier_address) {
		this.supplier_address = supplier_address;
	}
	
	

}
