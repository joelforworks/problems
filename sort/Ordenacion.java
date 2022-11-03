public void Ordenar(int[] nums){
        int ini=0;
        int max=nums[ini];
        int pos=0;
        do{
            for(int i=ini;i<nums.length;i++){
                if(nums[i]>max){
                    max=nums[i];
                    pos=i;
                }
            }
            
            nums[pos]=nums[ini];
            nums[ini]=max;
            ini++;
            max=nums[ini];
        }while(ini!=nums.length-1);
    }

