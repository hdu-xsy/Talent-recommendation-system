package util;

public enum ConnectUser {
    DEV,SYS,ADMIN,HR,STUFF;

    @Override
    public String toString() {
        String user="";
        switch (this){
            case DEV:{user= "develop";break;}
            case SYS:{user="sys";break;}
            case ADMIN:{user= "admin";break;}
            case HR:{user= "hr";break;}
            case STUFF:{user= "struff";break;}
        }
        return user;
    }
}
