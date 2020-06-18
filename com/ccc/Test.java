public class Test {

    static class Child{

        public Child(int p,boolean v){
            this.p = p;
            this.v = v;
        }
        public int p;
        public    boolean v;
    }

    public static void main(String[] args) {
        boolean[] people = new boolean[4];
        Child[] children = new Child[4];
        children[0] = new Child(0,false);
        children[1] = new Child(2,true);
        children[2] = new Child(3,false);
        children[3] = new Child(3,false);
        for(int i = 0;i<4;i++){
            children[i].v = !children[i].v;
            for(int j =0;j<4;j++){
                people[children[j].p] = children[j].v;
            }
            int n = 0;
            for(int k=0;k<4;k++){
                if(people[k] == true){
                    n++;
                }
            }
            if(n == 1){
                for(int k=0;k<4;k++){
                    if(people[k] == true){
                        System.out.println(k);
                    }
                }
            }
        }
    }
}
