package TASK;

public class Occurence {
public static void main(String[]args)
{
int[] arr= {1,3,1,2,3,3,4,0,4,7,7,7,0,7,8,3,3,9};

int sum=0,avg = 0;
for (int i = 0; i < arr.length; i++) {
for (int j = i+1; j < arr.length; j++) {
int temp=0;
if(arr[i]<arr[j]) {
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}System.out.println("max"+arr[0]);
System.out.println("min"+arr[arr.length-1]);
for (int i = 0; i < arr.length; i++) {
sum=sum+arr[i];
avg=sum/arr.length;
}
System.out.println("avg"+avg);
for (int i = 0; i < arr.length; i++) {
if(arr[i]!=0)
{   int aara=arr[i];
int count=0;
for (int j = 0; j < arr.length; j++) {
if(aara==arr[j]) {
count++;
arr[j]=0;
}

}System.out.println(aara+"--->"+count);
}
}


}

}