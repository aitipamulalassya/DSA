class ProductOfNumbers {
    List<Integer> preProduct;
    int prod=1;
    public ProductOfNumbers() {
     preProduct=new ArrayList<>();
    }

    public void add(int num) {
     if(num==0){
    preProduct=new ArrayList<>();
    prod=1;
    return;
}
prod=prod*num;
preProduct.add(prod);
    }

    public int getProduct(int k) {
if(preProduct.size()<k)return 0;
int total=preProduct.get(preProduct.size()-1);
if(preProduct.size()==k)return total;
return total/preProduct.get(preProduct.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */