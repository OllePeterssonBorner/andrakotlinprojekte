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

    println("[3] " +"Sortera kontakter alfabetiskt")





        var wrote = readLine()!!.toInt()

        when (wrote){



            1 -> {
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

            2 -> {
            var qount = 1
            for (c in contactHandler.contactlist)
            {

                println(qount)
                println(c.forename + c.surname)



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

            when (wroteineni) {


                1 -> {
                    println("Förnamn:" + contactHandler.contactlist[written].forename)
                    contactHandler.contactlist[written].forename = readLine().toString()
                }

                2 -> {
                    println("Efternamn:" + contactHandler.contactlist[written].surname)
                    contactHandler.contactlist[written].surname = readLine().toString()
                }

                3 -> {
                    println("Telefonnummer:" + contactHandler.contactlist[written].phonynumber)
                    contactHandler.contactlist[written].phonynumber = readLine().toString()
                }

                4 -> {
                    println("E-mail:" + contactHandler.contactlist[written].email)
                    contactHandler.contactlist[written].email = readLine().toString()
                }

                5 -> {
                    contactHandler.contactlist.removeAt(written)

                    var tempförnamn = contactHandler.contactlist[written].forename
                    var tempefternamn = contactHandler.contactlist[written].surname

                    println("Kontakten" + tempförnamn + tempefternamn + "togs bort")
                    readLine()
                }


                }

            }
            3 ->{
                contactHandler.contactlist.sortWith(compareBy(String.CASE_INSENSITIVE_ORDER){it.forename})
                println("Listan har sorterats alfabetiskt")
                readLine()
            }
        }

    }




}

