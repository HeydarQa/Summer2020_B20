package day10_IfStatements;
/*
    status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable
 */
public class HTTP {
    public static void main(String[] args) {
        int num=403;
        String result="";

        if (num==200) {
            result="ok";
        }else if (num==201){
            result="Created";
        }else if (num==202){
            result="Accepted";
        }else if (num==301){
            result="Moved Permanently";
        }else if (num==303){
            result="See Other";
        }else if (num==304){
            result="Not Modified";
        }else if (num==307){
            result="Temporary Redirect";
        }else if (num==400){
            result="Bad Request";
        }else if (num==401){
            result="Unauthorized";
        }else if (num==403){
            result="Forbidden";
        }else{
            result="Service Unavailable";
        }

        System.out.println(result);



    }
}
