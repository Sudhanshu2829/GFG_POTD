class Intersect
{
    int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node ptr1 = head1, ptr2 = head2;
         while(ptr1!=ptr2){
             ptr1 = ptr1==null?head2:ptr1.next;
             ptr2 = ptr2==null?head1:ptr2.next;
         }
         return ptr1.data;
	}
}