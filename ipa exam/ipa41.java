import java.util.Arrays;
import java.util.Scanner;

public class ipa41 {
    public static void main(String[] args) {
        Footware[] ft = new Footware[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ft.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            ft[i] = new Footware(a, b, c, d);
        }
        String op = sc.nextLine();
        String lp = sc.nextLine();
        int ans = getCountByType(ft, op);
        if (ans != 0) {
            System.out.println(ans);
        } else {
            System.out.println("Footwear not available");
        }

        Footware ans1 = getSecondHighestPriceByBrand(ft, lp);
        if(ans1!=null)
        {
            System.out.println(ans1.getFootwareId());
            System.out.println(ans1.getFootwareName());
            System.out.println(ans1.getPrice());
        }
        else{
            System.out.println("Brand not available");
        }
    }

    

    public static int getCountByType(Footware[] ft, String op) {
        int count = 0;
        for (int i = 0; i < ft.length; i++) {
            if (ft[i].getFootwareType().equalsIgnoreCase(op)) {
                count++;
            }
        }
        if (count > 0) {
            return count;
        } else {
            return 0;
        }
    }

    public static Footware getSecondHighestPriceByBrand(Footware[] ft, String lp) 
        {
            Footware[] lobby = new Footware[0];
            Footware temp;
            for (int i = 0; i < ft.length; i++) {
                if (ft[i].getFootwareName().equalsIgnoreCase(lp)) {
                    lobby = Arrays.copyOf(lobby, lobby.length + 1);
                    lobby[lobby.length - 1] = ft[i];
                }
            }
            for (int i = 0; i < lobby.length; i++) {
                for (int j = i; j < lobby.length; j++) {
                    if (lobby[i].getPrice() < lobby[j].getPrice()) {
                        temp = lobby[i];
                        lobby[i] = lobby[j];
                        lobby[j] = temp;
                    }
                }
            }
            if(lobby.length>0)
            {
                return lobby[lobby.length-2];    
            }
            else{
                return null;
            }
        
    }
}

class Footware{
    private int footwareId;
    private String footwareName;
    private String footwareType;
    private int price;

    public Footware(int footwareId, String footwareName, String footwareType, int price) {
        this.footwareId = footwareId;
        this.footwareName = footwareName;
        this.footwareType = footwareType;
        this.price = price;

        }

    public int getFootwareId() {
        return footwareId;
    }

    public void setFootwareId(int footwareId) {
        this.footwareId = footwareId;
    }

    public String getFootwareName() {
        return footwareName;
    }

    public void setFootwareName(String footwareName) {
        this.footwareName = footwareName;
    }

    public String getFootwareType() {
        return footwareType;
    }

    public void setFootwareType(String footwareType) {
        this.footwareType = footwareType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
        
}
