class Contact(var surname: String, var forename: String, var phonynumber: String, var email: String)

class ContactHandler{


    var contactlist = arrayListOf<Contact>()

    fun Add(surname: String, forename: String, phonynumber: String, email: String){
        contactlist.add(Contact(surname, forename, phonynumber, email))



    }
}

fun main(args: Array<String>) {



    var contactHandler = ContactHandler()
    while (true)
    {
    println("[1] Lägg till kontakt")

    println("[2] Visa kontakter")





        val wrote = readLine()

        if (wrote == "1")
        {

            println("Förnamn:")
            var forename = readLine().toString()

            println("Efternamn:")
            val surname = readLine().toString()

            println("Telefonnummer")
            val phonynumber = readLine().toString()

            println("E-mail")
            val email = readLine().toString()

            contactHandler.Add(surname, forename, phonynumber,email)


        }
        else if(wrote == "2")
        {

            var qount = 1
            for (c in contactHandler.contactlist)
            {

                println(qount)
                println("Förnamn:" + c.forename)
                println("Efternamn:" + c.surname)


                qount++

            }
            var written = readLine()!!.toInt()
                written -= 1



                println("[1] " +"Förnamn:" + contactHandler.contactlist[written].forename)
                println("[2] " +"Efternamn:" + contactHandler.contactlist[written].surname)
                println("[3] " +"Telefonnummer:" + contactHandler.contactlist[written].phonynumber)
                println("[4] " +"E-mail:" + contactHandler.contactlist[written].email)
                println("[5] " +"Ta bort kontakt")



                var wroteineni = readLine()!!.toInt()

                if (wroteineni == 1)
                {
                    println("Förnamn:"+ contactHandler.contactlist[written].forename)
                    contactHandler.contactlist[written].forename = readLine().toString()
                }
                else if (wroteineni == 2)
                {
                    println("Efternamn:"+ contactHandler.contactlist[written].surname)
                    contactHandler.contactlist[written].surname = readLine().toString()
                }
                else if (wroteineni == 3)
                {
                    println("Telefonnummer:"+ contactHandler.contactlist[written].phonynumber)
                    contactHandler.contactlist[written].phonynumber = readLine().toString()
                }
                else if (wroteineni == 4)
                {
                    println("E-mail:"+ contactHandler.contactlist[written].email)
                    contactHandler.contactlist[written].email = readLine().toString()
                }
                else if (wroteineni == 5)
                {
                    contactHandler.contactlist.removeAt(written)

                    var tempförnamn = contactHandler.contactlist[written].forename
                    var tempefternamn =   contactHandler.contactlist[written].surname

                    println("Kontakten" + tempförnamn + tempefternamn +"togs bort")
                    readLine()
                }


        }
    }




}

