import java.util.Arrays;
import java.util.Scanner;

public class ipa40 {
    public static void main(String[] args) {
        
            Hotel[] ht = new Hotel[4];
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<ht.length;i++)
            {
                int a=sc.nextInt();sc.nextLine();
                String b=sc.nextLine();
                String c=sc.nextLine();
                int d=sc.nextInt();sc.nextLine();
                String e=sc.nextLine();
                double f=sc.nextDouble();sc.nextLine();
                ht[i]=new Hotel(a,b,c,d,e,f);
            }
            String str=sc.nextLine();
            String str1=sc.nextLine();
            int ans=noOfRoomsBookedInGivenMonth(ht,str);
            if(ans!=0)
            {
                System.out.println(ans);
            }
            else{
                System.out.println("No Rooms Booked in the given month");
            }

            Hotel ans2=searchHotelByWifiOption(ht,str1);
            if(ans2!=null)
            {
                System.out.println(ans2.getHotelId());
            }
            else{
                System.out.println("No such option available");
            }

        }
        public static int noOfRoomsBookedInGivenMonth(Hotel[] ht,String str)
        {
            int count=0;
            for(int i=0;i<ht.length;i++)
            {
                if(ht[i].getDateOfBooking().contains(str))
                {
                    count=ht[i].getNoOfRoomsBooked();
                }
            }
           if(count>0)
           {
            return count;
           }
           else{
            return 0;
           }
        }

        public static Hotel searchHotelByWifiOption(Hotel[] ht,String str1)
        {
            Hotel[] ht2=new Hotel[0];
            Hotel temp;
            for(int i=0;i<ht.length;i++)
            {
                if(ht[i].getWifiFacility().equals(str1))
                {
                    ht2=Arrays.copyOf(ht2, ht2.length+1);
                    ht2[ht2.length-1]=ht[i];
                }
            }
            for(int i=0;i<ht2.length;i++)
            {
                for(int j=i;j<ht2.length;j++)
                {

                    if(ht2[i].getTotalBill()>ht2[j].getTotalBill())
                    {
                        temp=ht2[i];
                        ht2[i]=ht2[j];
                        ht2[j]=temp;
                    }
                }
            }
            if(ht2.length>0)
            {
                return ht2[ht2.length-2];
            }
            else{
                return null;
            }
        }
    }
    

class Hotel{
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) 
    {
     
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    
}
