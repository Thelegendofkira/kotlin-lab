setCOntent{
    var navController=rememberNavController
    NavHost(navController,startDestination="title"){
        composable("title"){
            TitleScreen(navController)
        }
        composable("gamescreen"){
            GameScreen(navController)
            }
    }
}
fun TitleScreen(navController:Navcontroller){
    column(modifier=Modeifier.fillMaxSize(),horizontalAlignment=Aligmnet.centerHorizontlly,verticalArrangement=Arangement.center){
        Text(text="welcome ot trivia app");
        Button(onClick={
            navController.navigate("gamescreen")
        }){
            Text("Search")}
    }
}
fun GameScreen(navController:Navcontroller){
    var setResult by remember {mutableStateOf(false)}
    var Selectedoption by remember {mutableStateOf("")}
    data class Question(val question:string,val options:List<String>,val answer:string)

    var questiondata=Question(question="what is the capital of telangana",options=listOf("hyd","ban),answer="hyd")

    column(modifier=Modeifier,contentAlignment=Aligmnet.center){
        Text(text=questiondata.question)
        spacer(Modeifier.height(20.dp))
        for(option in questiondata.options){
            Row(Modeifier.fillaMaxWidt){
                RadioButton(
                    onClick={
                        Selectedoption=option
                    }
                )
                Text(option)

            }
        }
        Button(onClick={setResult=true})
        if(setResult==true){
            Text(if(Selectedoption==answer)correct else Incorrect)}
    }
}