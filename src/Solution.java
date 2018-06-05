class Solution{
    public void wifiPassword(int N,String[] s){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<N;++i){
            String st=s[i];
            int mark=0;
            for(int j=0;j<15;++j){
                if(st.charAt(j)=='T'){
                    mark=j;
                    break;
                }
            }
            sb.append((char)(st.charAt(mark-2)-16));
        }
        System.out.println(sb.toString());
    }
}
