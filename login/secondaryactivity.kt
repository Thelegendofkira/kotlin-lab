override fun oncreate(savedInstancestate:Bundler?){
    super.oncreate();
    enableEdgeToEdge;
    setContent{
        var ussername=intent.getStringExtra("username");
        messageHello(username:string);
    }

}
fun messageHello(username:string){
    column(modifier=Modeifier.fillMaxSize(),contentAlignment=Aligmnet.center){
        Text(text=username,fontsize=30.sp)
    }
}