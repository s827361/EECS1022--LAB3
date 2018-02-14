package eecs1022.eecs1022___lab3;

/**
 * Created by user on 2/14/18.
 */
public class Game
{
    String p1;
    String p2;
    String p11;
    String p12;
    String p21;
    String p22;
    String p31;
    String p32;
    double round;





    public Game(String p1, String p2, String p11, String p12)
    {
        if (round == 0)
        {
            this.p1 = p1;
            this.p2 = p2;
            this.p11 = p11;
            this.p12 = p12;


        }
        if  (round == 1){
            this.p1=p1;
            this.p2=p2;
            this.p21 = p11;
            this.p22= p12;

        }
        if (round == 2){
            this.p1=p1;
            this.p2=p2;
            this.p31=p11;
            this.p32=p12;
        }
    }







    public String toString()
    {
        String s = "";
        if (round == 0)
        {

            s = "Round 1 Finished,";
            s += "\n";
            if (p11 == p12)
            {
                s += "Tie between" + p1 + "and" + p2;


            }
            if (p11 == "Paper" && p12 == "Scissors")
            {
                s += "Winner is " + p2;

            }
            if (p11 == "Paper" && p12 == "Rock")
            {
                s += "Winner is " + p1;

            }
            if (p11 == "Rock" && p12 == "Scissors")
            {
                s += "Winner is " + p1;

            }
            if (p11 == "Rock" && p12 == "Paper")
            {
                s += "Winner is " + p2;

            }
            if (p11 == "Scissors" && p12 == "Paper")
            {
                s += "Winner is " + p1;

            }
            if (p11 == "Scissors" && p12 == "Rock")
            {
                s += "Winner is " + p2;

            }


        }
        if (round ==1){
            s = "Round 2 Finished," ;
            s += "\n";
            if(p21 == p22){
                s += "Tie between" + p1 + "and" +p2;



            }
            if (p21 == "Paper" && p22 == "Scissors"){
                s += "Winner is "+ p2;

            }
            if (p21 == "Paper" && p22 == "Rock"){
                s += "Winner is "+ p1;

            }
            if (p21 == "Rock" && p22 == "Scissors"){
                s += "Winner is "+ p1;

            }
            if (p21 == "Rock" && p22 == "Paper"){
                s += "Winner is "+ p2;

            }
            if (p21 == "Scissors" && p22 == "Paper"){
                s += "Winner is "+ p1;

            }
            if (p21 == "Scissors" && p22 == "Rock"){
                s += "Winner is "+ p2;

            }
        }
        if(round ==2){
            s = "Round 3 Finished," ;
            s += "\n";
            if(p31 == p32){
                s += "Tie between" + p1 + "and" +p2;



            }
            if (p31 == "Paper" && p32 == "Scissors"){
                s += "Winner is "+ p2;

            }
            if (p31 == "Paper" && p32 == "Rock"){
                s += "Winner is "+ p31;

            }
            if (p31 == "Rock" && p32 == "Scissors"){
                s += "Winner is "+ p1;

            }
            if (p31 == "Rock" && p32 == "Paper"){
                s += "Winner is "+ p2;

            }
            if (p31 == "Scissors" && p32 == "Paper"){
                s += "Winner is "+ p1;

            }
            if (p31 == "Scissors" && p32 == "Rock"){
                s += "Winner is "+ p2;

            }
            s += "Game is over.";

        }
        return s;
    }

    public void setP1(String p1)
    {
        this.p1 = p1;
    }

    public void setP2(String p2)
    {
        this.p2 = p2;
    }

    public void setP11(String p11)
    {
        this.p11 = p11;
    }

    public void setP21(String p21)
    {
        this.p21 = p21;
    }

    public void setP22(String p22)
    {
        this.p22 = p22;
    }

    public void setP31(String p31)
    {
        this.p31 = p31;
    }

    public void setP32(String p32)
    {
        this.p32 = p32;
    }

    public void setRound(double round)
    {
        this.round = round;
    }

    public void setP12(String p12)
    {
        this.p12 = p12;
    }
}
