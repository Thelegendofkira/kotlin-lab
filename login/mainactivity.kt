fun LoginPage(){
    var context=LocalContext.current
    var username by remember {mutableStateOf("")}
    var password by remember {mutableStateOf("")}
    column(modifier=Modeifier.fillMaxSize(),verticalArrangement=Arrangement.center,horizontalAlignment=Aligmnet.horizontalAlignment){
        TextField(value=username ,onValueChange={username=it},label={Text(text="username")})
        TextField(value=password,onValueChange={password=it},label={Text(text="password")})
        Button(onClick={
            if(username=="jaideep"&&password=="12345"){
                Toast.makeText(context,"Successful login",Toast.LENGTH_SHORT).show();
                var intent=Intent(context,SecondActivity::class.java);
                intent.putExtra("username",username);
                context.startActivity(intent);
            }})
        }
}