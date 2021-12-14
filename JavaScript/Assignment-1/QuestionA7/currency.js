function fun() {
    var amount = document.getElementById("number").value;
    var rupee = 0;
    var pound = 0;
    var euro = 0;
    var yen = 0;
    var ringgit = 0;

    rupee = amount * 70;
    document.write("Your " + amount + " Dollar is : " + rupee + " Ruppes" + "<br>").value;

    pound = amount * 0.78;
    document.write("Your " + amount + " Dollar is : " + pound + " Pound" + "<br>").value;

    euro = amount * 0.87;
    document.write("Your " + amount + " Dollar is : " + euro + " Euro" + "<br>").value;

    yen = amount * 111.087;
    document.write("Your " + amount + " Dollar is : " + yen + " Yen" + "<br>").value;

    ringgit = amount * 4.17;
    document.write("Your " + amount + " Dollar is : " + ringgit + " ringgit" + "<br>").value;


}