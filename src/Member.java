public class Member {
    private String name;
    private String email;

    public Member(String name, String email){
        setName(name);
        setEmail(email);
    }

    public void setName(String name){
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException("İsim alanı bos bırakılamaz!");
        } else {
            this.name = name;
        }
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
}
