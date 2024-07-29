#include<iostream>
using namespace std;
int main(){
  int arr[5]={2,1,53,3,6};
  for( int i=0;i<5;i=i+2){
    swap(arr[i],arr[i+1]);
  }
  for(int i=0;i<5;i++){
    cout<<arr[i]<<",";
  }
}
