data class Affirmation(val image:Int,val message:string)
fun AffirmationDemo(){
    val affimationlist=listOf(Affirmation(R.drawable.a,"sun is set"),
    Affirmation(R.drawable.b,"sun is rising"),
    Affirmation(R.drawable.c,"lunar camness"))
    LazyColumn(modifier=Modeifier.fillMaxSize(),Aligmnet=Aligmnet.center){
        items(affimationlist){
            aff->{
                AffirmationLayout(aff)
            }
        }
    }
    }
    fun AffirmationLayout(aff:Affirmation){
        column(modifier=Modeifier.fillMaxSize(),Aligmnet=Aligmnet.center,verticalArrangement=Arangement.center,horizontalAlignment=center.horizontalAlignment)
        {
            Image(modifier=Modeifier.fillMaxSize(),
            painter=painterResource(id=aff.image);
            contentDescription=aff.text
            )
            Text(text=aff.text,fontsize=30.sp)
        }
    }