package Model;

import java.util.UUID;

public class Order {
    private UUID order_id;
    private String email_id;
    private String password;
    private String car_name;
    private String repair_desc;

    public UUID getOrder_id() {
        return order_id;
    }

    public void setOrder_id(UUID order_id) {
        this.order_id = order_id;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getRepair_desc() {
        return repair_desc;
    }

    public void setRepair_desc(String repair_desc) {
        this.repair_desc = repair_desc;
    }
}
