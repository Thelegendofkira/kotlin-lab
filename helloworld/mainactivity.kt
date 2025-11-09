class MainActivity:compoenentActivity(){
    override fun oncreate(savedInstancestate:Bundel?){
        super.oncreate(savedInstancestate)
        enableEdgeToEdge
        setCOntent{
            Helloworld()
        }
    }
}
@compoabole
fun Helloworld(){
    Box(modifier=Modeifier.fillMaxSize(),contentAlignment=Aligmnet.center){
        Text(text="Helloworld",color=Color.Red,fontsize=30.sp,fontWeight=FontWeight.bold )
    }
}