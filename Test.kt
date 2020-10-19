package luongvany.k12tt

import javafx.stage.Stage
import luongvany.k12tt.style.Style
import luongvany.k12tt.view.staffview.stafftableview.StaffView
import tornadofx.App

class Test: App(StaffView::class, Style::class){
    override fun start(stage: Stage) {
        with(stage){
            width = 1000.0
            height = 600.0
        }

        super.start(stage)
    }
}