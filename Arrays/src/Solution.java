class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    	if(lists.length==1){
            return lists[0];
        }
        int half=lists.length/2,i=0,full=lists.length,k=0;
        ListNode nextnode=null,prevnode=null;
        while(half!=0){
            i=0;
            for(i=0;i<half && i+half<full;i++){
                nextnode=lists[i];
                prevnode=null;
                    if(nextnode!=null){
                        while(lists[i+half]!=null){
                            if(nextnode!=null && nextnode.val>lists[i+half].val){
                                ListNode temp=lists[i+half];
                                lists[i+half]=lists[i+half].next;
                                temp.next=nextnode;
                                nextnode=temp;
                                if(prevnode!=null){
                                    prevnode.next=nextnode;
                                }
                                else {
                                	lists[i]=nextnode;
                                }
                            }
                            else if(nextnode!=null){
                                prevnode=nextnode;
                                nextnode=nextnode.next;
                            }
                            else {
                            	prevnode.next=lists[i+half];
                            	break;
                            }
                        }
                    }
                    else{
                            lists[i]=lists[i+half];
                        }
                    }
                
                half=half/2;
            }
        if(full%2!=0 && lists[full-1]!=null){
            if(lists[0]!=null){
                nextnode=lists[0];
                prevnode=null;
                while(lists[full-1]!=null){
                    if(nextnode!=null && nextnode.val>lists[full-1].val){
                        ListNode temp=lists[full-1];
                        lists[full-1]=lists[full-1].next;
                        temp.next=nextnode;
                        nextnode=temp;
                        if(prevnode!=null){
                                    prevnode.next=nextnode;
                        }
                        else {
                        	lists[0]=nextnode;
                        }
                    }
                    else if(nextnode!=null) {
                        prevnode=nextnode;
                        nextnode=nextnode.next;
                    }
                    else {
                    	prevnode.next=lists[full-1];
                    	break;
                    }
                }
            }
            else{
                lists[0]=lists[full-1];
            }
        }
        return lists[0];
    }
}
