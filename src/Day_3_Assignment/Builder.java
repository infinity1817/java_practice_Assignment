package Day_3_Assignment;

public class Builder {
    public static class User{
        private String name , address , email;
        private int age , pincode , mobileNo;

        private User(Build builder){
            this.name = builder.name;
            this.address = builder.address;
            this.email  = builder.email;
        }
        public static class Build{
            private String name ;
            private String address ;
            private String email;
            private int age , pincode , mobileNo;

            public Build setName(String name){
                this.name  = name;
                return this;
            }

            public Build setAddress(String address){
                this.address = address;
                return this;
            }

            public Build setEmail(String email){
                this.email = email;
                return this;
            }
            public User build(){
                return new User(this);
            }


        }

    }

    public void main(String[] args){

        User user = new User.Build().setAddress("abcd").setEmail("nkyy").build();
    }
}
