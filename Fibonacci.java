
public class Fibonacci {
    public static void main(String[] args){
        // 0,1,1,2,3,5,8,13
        int n = 10;
        int first = 0, second = 1, next=0;
        System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i=1; i<n; i++){
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}

/* select max(salary) from employee where salary =
(select max(salary) from employee where salary =
(select max(salary) from employee));
*/

/*
select * from employee
group by city
 */

