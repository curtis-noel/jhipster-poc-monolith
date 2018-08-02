import { NgModule } from '@angular/core';

import { JhmonolithpocSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [JhmonolithpocSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [JhmonolithpocSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class JhmonolithpocSharedCommonModule {}
