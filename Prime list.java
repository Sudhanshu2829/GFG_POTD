class Solution
{
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int nearestPrime(int n) {
    
        if (isPrime(n))
            return n;
        
        int low = n, high = n;
        
        while (true) {
            low--;
            high++;
            if (isPrime(low))
                return low;
            if (isPrime(high))
                return high;
        }
    }
    
    public Node primeList(Node head) {
        Node curr = head;
        while (curr != null) {
            curr.val = nearestPrime(curr.val);
            curr = curr.next;
        }
        return head;
    }
}
