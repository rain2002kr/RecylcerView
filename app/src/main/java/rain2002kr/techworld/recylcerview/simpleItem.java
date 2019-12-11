package rain2002kr.techworld.recylcerview;

public class simpleItem {
    int resId;
    String name,phone;

    public simpleItem(int resId, String name, String phone) {
        this.resId = resId;
        this.name = name;
        this.phone = phone;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "simpleItem{" +
                "resId=" + resId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
