package com.favrizzio.practicas.general;

import java.util.ArrayList;
import java.util.List;

public class MakeLongStrings {

    public static void main(String[] args) {

        List<String> hiddens = getHiddens();
        List<String> prevs = getPrevs();
        List<String> nexts = getNexts();
        List<String> titles = getTitles();

        // for (int i = 0; i < 40; i++) {
        // System.out.println((i + 1) + ":\"" + hiddens.get(i) + "\",");
        // }

        // for (int i = 0; i < 40; i++) {
        // System.out.println((i + 1) + ":\"" + prevs.get(i) + "\",");
        // }

        // for (int i = 0; i < 40; i++) {
        // System.out.println((i + 1) + ":\"" + nexts.get(i) + "\",");
        // }

        for (int i = 0; i < 40; i++) {
            System.out.println((i + 1) + ":\"" + titles.get(i) + "\",");
        }

    }

    private static List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        titles.add("Comienza tu embarazo. Un viaje hacia la vida");
        titles.add("Pienso que estoy embrazada");
        titles.add("Paso a paso me voy formando");
        titles.add("Mamá me estoy haciendo bebé");
        titles.add("Mi bebé parece un porotito");
        titles.add("Mamá ¡me estoy formando!");
        titles.add("¡Pronto me vas a sentir mamá!");
        titles.add("¡No paro de moverme!");
        titles.add("Ya soy todo un bebé");
        titles.add("Mis órganos funcionan juntos ¡Parecen una orquesta!");
        titles.add("Salto, pateo y hago pis");
        titles.add("¡Soy pura cabeza!");
        titles.add("Me chupo el dedo pulgar");
        titles.add("Moviendo la cabeza");
        titles.add("Empiezo a ejercitarme para fortalecerme mamá");
        titles.add("Comienza el estirón");
        titles.add("Mamá ya puedo coordinar mis movimientos");
        titles.add("Tu bebé crece día a día");
        titles.add("Tu bebé te escucha");
        titles.add("Soy todo un hombrecito o mujercita");
        titles.add("¿Mamá sentís cómo me muevo?");
        titles.add("Tu carita me resulta familiar");
        titles.add("¡Mamá peso medio kilo!");
        titles.add("Mamá te escucho");
        titles.add("Soy todo un bebote");
        titles.add("¡Mamá cada día tengo menos espacio en tu panza!");
        titles.add("Comienza el último trimestre de gestación");
        titles.add("Tu bebé abre los ojos");
        titles.add("Tu bebé está más activo que nunca");
        titles.add("¡Tu bebé distingue la luz!");
        titles.add("Tu bebé se prepara poco a poco para nacer");
        titles.add("Aumento mucho de peso para estar fuerte");
        titles.add("¡Mami estamos en la recta final!");
        titles.add("Mami ¡soy todo un soñador!");
        titles.add("¡Estoy por salir mamá!");
        titles.add("Me preparo para conocer a mis papás");
        titles.add("Tu bebé está “a punto”");
        titles.add("Estamos en la recta final");
        titles.add("Mamá de un momento a otro voy a nacer");
        titles.add("Tu bebé acaba de nacer");
        return titles;
    }

    private static List<String> getHiddens() {

        List<String> hiddens = new ArrayList<>();
        hiddens.add("http://movilesc.com/mibebe/semana-1-me-siento-rara-es-normal/");
        hiddens.add("http://movilesc.com/mibebe/vas-a-ser-mama/");
        hiddens.add("http://movilesc.com/mibebe/el-control-del-embarazo-a-las-3-semanas/");
        hiddens.add("http://movilesc.com/mibebe/tengo-un-retraso/");
        hiddens.add("http://movilesc.com/mibebe/algunos-consejos-para-sobrellevar-las-nauseas/");
        hiddens.add("http://movilesc.com/mibebe/tips-para-la-semana-6-salir-a-caminar/");
        hiddens.add("http://movilesc.com/mibebe/que-humor-que-tengo/");
        hiddens.add("http://movilesc.com/mibebe/es-el-momento-del-primer-analisis/");
        hiddens.add("http://movilesc.com/mibebe/me-viene-el-mareo/");
        hiddens.add("http://movilesc.com/mibebe/el-analisis-del-primer-trimestre/");
        hiddens.add("http://movilesc.com/mibebe/que-ropa-interior-uso/");
        hiddens.add("http://movilesc.com/mibebe/de-que-se-trata-la-puncion-de-las-vellocidades-coriales/");
        hiddens.add("http://movilesc.com/mibebe/puedo-tener-relaciones-sexuales-mientras-estoy-embarazada/");
        hiddens.add("http://movilesc.com/mibebe/me-sangran-las-encias-y-la-nariz-es-normal/");
        hiddens.add("http://movilesc.com/mibebe/la-linea-alba-y-los-cambios-en-el-color-de-la-piel/");
        hiddens.add("http://movilesc.com/mibebe/llego-el-momento-de-descartar-infecciones/");
        hiddens.add("http://movilesc.com/mibebe/calambres-y-aumento-de-los-pechos/");
        hiddens.add("http://movilesc.com/mibebe/mama-no-fumes/");
        hiddens.add("http://movilesc.com/mibebe/que-debo-comer-durante-mi-embarazo/");
        hiddens.add("http://movilesc.com/mibebe/informacion-que-brinda-el-ultrasonido/");
        hiddens.add("http://movilesc.com/mibebe/que-tengo-prohibido-comer/");
        hiddens.add("http://movilesc.com/mibebe/el-utero-crece-sin-parar/");
        hiddens.add("http://movilesc.com/mibebe/puedo-viajar-en-avion-si-espero-un-bebe/");
        hiddens.add("http://movilesc.com/mibebe/mama-cambiame-esa-musica/");
        hiddens.add("http://movilesc.com/mibebe/los-temores-de-los-futuros-papas/");
        hiddens.add("http://movilesc.com/mibebe/te-hacen-falta-vitaminas/");
        hiddens.add("http://movilesc.com/mibebe/a-cuidar-mi-boca/");
        hiddens.add("http://movilesc.com/mibebe/es-normal-que-me-pique-la-piel-durante-el-embarazo/");
        hiddens.add("http://movilesc.com/mibebe/sueno-cosas-raras/");
        hiddens.add("http://movilesc.com/mibebe/la-natacion-lo-mejor-para-la-futura-mama/");
        hiddens.add("http://movilesc.com/mibebe/a-combatir-la-celulitis-con-buenos-alimentos/");
        hiddens.add("http://movilesc.com/mibebe/el-calcio-y-la-vitamina-d-amigos-de-los-huesos/");
        hiddens.add("http://movilesc.com/mibebe/que-es-el-colesterol-bueno-y-el-colesterol-malo/");
        hiddens.add("http://movilesc.com/mibebe/ser-papas-en-la-madurez/");
        hiddens.add("http://movilesc.com/mibebe/lo-que-tenes-que-llevar-el-dia-del-parto/");
        hiddens.add("http://movilesc.com/mibebe/la-anemia-en-el-embarazo/");
        hiddens.add("http://movilesc.com/mibebe/puedo-tener-relaciones-sexuales-mientras-estoy-embarazada-2/");
        hiddens.add("http://movilesc.com/mibebe/que-es-la-diabetes-gestacional/");
        hiddens.add("http://movilesc.com/mibebe/la-indigestion-la-hace-mal-a-mi-bebe/");
        hiddens.add("http://movilesc.com/mibebe/que-hacer-ante-la-gripe-y-resfrios/");
        return hiddens;
    }

    private static List<String> getPrevs() {
        List<String> prevs = new ArrayList<>();
        prevs.add("http://movilesc.com/mibebe/semana-1-comienza-tu-embarazo-un-viaje-hacia-la-vida/");
        prevs.add("http://movilesc.com/mibebe/semana-2-pienso-que-estoy-embrazada/");
        prevs.add("http://movilesc.com/mibebe/paso-a-paso-me-voy-formando/");
        prevs.add("http://movilesc.com/mibebe/mama-me-estoy-haciendo-bebe/");
        prevs.add("http://movilesc.com/mibebe/mi-bebe-parece-un-porotito/");
        prevs.add("http://movilesc.com/mibebe/mama-me-estoy-formando/");
        prevs.add("http://movilesc.com/mibebe/pronto-me-vas-a-sentir-mama/");
        prevs.add("http://movilesc.com/mibebe/no-paro-de-moverme/");
        prevs.add("http://movilesc.com/mibebe/ya-soy-todo-un-bebe/");
        prevs.add("http://movilesc.com/mibebe/mis-organos-funcionan-juntos-parecen-una-orquesta/");
        prevs.add("http://movilesc.com/mibebe/salto-pateo-y-hago-pis/");
        prevs.add("http://movilesc.com/mibebe/soy-pura-cabeza/");
        prevs.add("http://movilesc.com/mibebe/me-chupo-el-dedo-pulgar/");
        prevs.add("http://movilesc.com/mibebe/moviendo-la-cabeza/");
        prevs.add("http://movilesc.com/mibebe/empiezo-a-ejercitarme-para-fortalecerme-mama/");
        prevs.add("http://movilesc.com/mibebe/comienza-el-estiron/");
        prevs.add("http://movilesc.com/mibebe/mama-ya-puedo-coordinar-mis-movimientos/");
        prevs.add("http://movilesc.com/mibebe/tu-bebe-crece-dia-a-dia/");
        prevs.add("http://movilesc.com/mibebe/tu-bebe-te-escucha/");
        prevs.add("http://movilesc.com/mibebe/soy-todo-un-hombrecito-o-mujercita/");
        prevs.add("http://movilesc.com/mibebe/mama-sentis-como-me-muevo/");
        prevs.add("http://movilesc.com/mibebe/tu-carita-me-resulta-familiar/");
        prevs.add("http://movilesc.com/mibebe/mama-peso-medio-kilo/");
        prevs.add("http://movilesc.com/mibebe/mama-te-escucho/");
        prevs.add("http://movilesc.com/mibebe/soy-todo-un-bebote/");
        prevs.add("http://movilesc.com/mibebe/mama-cada-dia-tengo-menos-espacio-en-tu-panza/");
        prevs.add("http://movilesc.com/mibebe/comienza-el-ultimo-trimestre-de-gestacion/");
        prevs.add("http://movilesc.com/mibebe/tu-bebe-abre-los-ojos/");
        prevs.add("http://movilesc.com/mibebe/tu-bebe-esta-mas-activo-que-nunca/");
        prevs.add("http://movilesc.com/mibebe/tu-bebe-distingue-la-luz/");
        prevs.add("http://movilesc.com/mibebe/tu-bebe-se-prepara-poco-a-poco-para-nacer/");
        prevs.add("http://movilesc.com/mibebe/aumento-mucho-de-peso-para-estar-fuerte/");
        prevs.add("http://movilesc.com/mibebe/mami-estamos-en-la-recta-final/");
        prevs.add("http://movilesc.com/mibebe/mami-soy-todo-un-sonador/");
        prevs.add("http://movilesc.com/mibebe/estoy-por-salir-mama/");
        prevs.add("http://movilesc.com/mibebe/me-preparo-para-conocer-a-mis-papas/");
        prevs.add("http://movilesc.com/mibebe/tu-bebe-esta-a-punto/");
        prevs.add("http://movilesc.com/mibebe/estamos-en-la-recta-final/");
        prevs.add("http://movilesc.com/mibebe/mama-de-un-momento-a-otro-voy-a-nacer/");
        prevs.add("#");
        return prevs;
    }

    private static List<String> getNexts() {
        List<String> nexts = new ArrayList<>();
        nexts.add("http://movilesc.com/mibebe/semana-2-pienso-que-estoy-embrazada/");
        nexts.add("http://movilesc.com/mibebe/paso-a-paso-me-voy-formando/");
        nexts.add("http://movilesc.com/mibebe/mama-me-estoy-haciendo-bebe/");
        nexts.add("http://movilesc.com/mibebe/mi-bebe-parece-un-porotito/");
        nexts.add("http://movilesc.com/mibebe/mama-me-estoy-formando/");
        nexts.add("http://movilesc.com/mibebe/pronto-me-vas-a-sentir-mama/");
        nexts.add("http://movilesc.com/mibebe/no-paro-de-moverme/");
        nexts.add("http://movilesc.com/mibebe/ya-soy-todo-un-bebe/");
        nexts.add("http://movilesc.com/mibebe/mis-organos-funcionan-juntos-parecen-una-orquesta/");
        nexts.add("http://movilesc.com/mibebe/salto-pateo-y-hago-pis/");
        nexts.add("http://movilesc.com/mibebe/soy-pura-cabeza/");
        nexts.add("http://movilesc.com/mibebe/me-chupo-el-dedo-pulgar/");
        nexts.add("http://movilesc.com/mibebe/moviendo-la-cabeza/");
        nexts.add("http://movilesc.com/mibebe/empiezo-a-ejercitarme-para-fortalecerme-mama/");
        nexts.add("http://movilesc.com/mibebe/comienza-el-estiron/");
        nexts.add("http://movilesc.com/mibebe/mama-ya-puedo-coordinar-mis-movimientos/");
        nexts.add("http://movilesc.com/mibebe/tu-bebe-crece-dia-a-dia/");
        nexts.add("http://movilesc.com/mibebe/tu-bebe-te-escucha/");
        nexts.add("http://movilesc.com/mibebe/soy-todo-un-hombrecito-o-mujercita/");
        nexts.add("http://movilesc.com/mibebe/mama-sentis-como-me-muevo/");
        nexts.add("http://movilesc.com/mibebe/tu-carita-me-resulta-familiar/");
        nexts.add("http://movilesc.com/mibebe/mama-peso-medio-kilo/");
        nexts.add("http://movilesc.com/mibebe/mama-te-escucho/");
        nexts.add("http://movilesc.com/mibebe/soy-todo-un-bebote/");
        nexts.add("http://movilesc.com/mibebe/mama-cada-dia-tengo-menos-espacio-en-tu-panza/");
        nexts.add("http://movilesc.com/mibebe/comienza-el-ultimo-trimestre-de-gestacion/");
        nexts.add("http://movilesc.com/mibebe/tu-bebe-abre-los-ojos/");
        nexts.add("http://movilesc.com/mibebe/tu-bebe-esta-mas-activo-que-nunca/");
        nexts.add("http://movilesc.com/mibebe/tu-bebe-distingue-la-luz/");
        nexts.add("http://movilesc.com/mibebe/tu-bebe-se-prepara-poco-a-poco-para-nacer/");
        nexts.add("http://movilesc.com/mibebe/aumento-mucho-de-peso-para-estar-fuerte/");
        nexts.add("http://movilesc.com/mibebe/mami-estamos-en-la-recta-final/");
        nexts.add("http://movilesc.com/mibebe/mami-soy-todo-un-sonador/");
        nexts.add("http://movilesc.com/mibebe/estoy-por-salir-mama/");
        nexts.add("http://movilesc.com/mibebe/me-preparo-para-conocer-a-mis-papas/");
        nexts.add("http://movilesc.com/mibebe/tu-bebe-esta-a-punto/");
        nexts.add("http://movilesc.com/mibebe/estamos-en-la-recta-final/");
        nexts.add("http://movilesc.com/mibebe/mama-de-un-momento-a-otro-voy-a-nacer/");
        nexts.add("http://movilesc.com/mibebe/tu-bebe-acaba-de-nacer/");
        nexts.add("#");
        return nexts;
    }
}
