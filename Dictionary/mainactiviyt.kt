fun DicionaryApp(){
var text by remember {mutableStateOf("")}
var showMenu by remember {mutableStateOf(false)}
var context=LocalContext.current
scaffold(
    topBar={
        TopAppBar(
            title="Dictinary App" )
            actions={
                IconButton(onClick={showMenu=true}){
                    Icon(
                        imageVector=Icon.Default.Moreveet,
                        contentDescription="menu icon"
                    )
                }
            }
            DropDownMenu(
                expang=showMenu
                onDismissRequest={showMeny=false}
            ){
                DropDownMenuIteam(
                    text="Help"
                )
            }
    }
){
    padding->{

    }
}
}