fun Dice(){
    var dicevalue by remember{mutableStateOf(1)}
    var context=LocalContext.current;
    column(modifier=Modeifier.fillMaxSize(),horizontalAlignment=Aligmnet.centerHorizontlly,verticalArrangement=Arangement.center){
        Image(painter=painterResource(getdice(dicevalue)),
        modifier=Modeifier.size(150.dp),
        contentDescription="DiceRoller")
        Text(text="U rolled $dicevalue")
        Button(onClick={
            dicevalue=(1..6).random()
            Toast.makeText(context,"You rolled $dicevalue",Toast.LENGTH_SHORT).show()

        }){
            Text(text="click to roll dice")
        }

    }
    }
    fun getDice(dicevalue:Int):Int
    {
        return when(dicevalue){
            1->R.drawable.dice1,
            2->R.drawable.dice2,
            3->R.drawable.dice3,
            else->R.drawable.dice6
        }
    }