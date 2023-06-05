package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CalendarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalendarFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    View view33;
    Button btn7;
    TextView txt7;
    EditText edt7;

    public CalendarFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalendarFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalendarFragment newInstance(String param1, String param2) {
        CalendarFragment fragment = new CalendarFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view33 = inflater.inflate(R.layout.fragment_calendar, container, false);

        btn7 = view33.findViewById(R.id.button7);
        txt7 = view33.findViewById(R.id.textt);
        edt7 = view33.findViewById(R.id.editt);

        List<String> bad = new ArrayList<>();
        List<String> records = Arrays.asList(getStr().split(","));

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inp = String.valueOf(edt7.getText());
                bad.clear();
                if (!inp.trim().equals("")) {
                    for (String item: records){
                        if (item.toLowerCase(Locale.ROOT).contains(inp.trim().toLowerCase(Locale.ROOT))){
                            bad.add(item);
                        }
                    }
                    txt7.setText(String.join("; ", bad));
                }
            }
        });

        return view33;
    }

    private String getStr(){
        String stri =
                "f152 Абрикос,f707 Алыча красная,f237 Айва,f72 Ананас," +
                        "f705 Алыча желтая,f33 Апельсин,f87 Арбуз,f29 Банан," +
                        "f700 Белая смородина,f182 Брусника,f358 Вишня,f50 Виноград белый," +
                        "f509 Виноград красный,f203 Гранат,f92 Грейпфрут,f30 Груша," +
                        "f300 Дыня,f145 Инжир,f708 Ирга,f749 Калина," +
                        "f766 Кизил,f44 Клубника,f702 Клюква,f171 Красная смородина," +
                        "f235 Крыжовник,f259 Лайм,f32 Лимон,f156 Малина," +
                        "f91 Манго,f34 Мандарин,s21 Можжевельник,f704 Облепиха," +
                        "f709 Помело,f53 Персик,f703 Рябина черноплодная,f148 Слива," +
                        "f706 Тутовник,f710 Фейхоа,f248 Финики,f286 Хурма," +
                        "f212 Черная смородина,f229 Черника,f281 Шиповник,f49 Яблоко," +
                        "f730 Черешня жёлтая,f73 Черешня красная,f175 Ежевика,f84 Киви," +
                        "f778 Плоды черемухи,f779 Голубика,rf491 Mal d1 Яблоко мажорный аллерген NEW,rf493 Mal d3 Яблоко минорный аллерген NEW," +
                        "f711 Горбуша,f323 Икра красная,f161 Кальмары,f186 Камбала," +
                        "f180 Карп,f714 Кета,f719 Кефаль,f292 Крабы," +
                        "f24 Креветки,f715 Лемонема,f720 Лещ,f41 Лосось," +
                        "f37 Мидии,f716 Минтай,f721 Мойва,f56 Окунь морской," +
                        "f196 Палтус,f780 Сазан речной,f722 Сайра,f21 Сельдь," +
                        "f741 Семга,f174 Скумбрия,f242 Сом,f723 Ставрида," +
                        "f247 Судак,f3 Треска,f40 Тунец,f22 Форель," +
                        "f354 Хек,f718 Щука,f724 Морской гребешок,f157 Навага," +
                        "f712 Осьминог,f178 Пикша,f726 Раки,f725 Осетр," +
                        "f560 Окунь речной,f745 Тилапия,f55 Угорь,f177 Устрицы," +
                        "f80 Лобстер (омар),f160 Сардина," +
                        "f131 Авокадо,f176 Баклажан,f734 Бобы,f12 Горох," +
                        "f751 Кабачки,f39 Капуста белокочанная,f134 Капуста брокколи,f108 Капуста брюссельская," +
                        "f728 Капуста квашеная,f208 Капуста китайская,f102 Капуста кольраби,f185 Капуста краснокочанная," +
                        "f729 Капуста морская,f61 Капуста цветная,f717 Кинза," +
                        "f48 Лук репчатый,f731 Лук зеленый,f66 Лук порей,f31 Морковь," +
                        "f122 Оливки,f546 Перец болгарский зеленый,f86 Петрушка," +
                        "f214 Редис,f732 Репа,f733 Салат,f85 Сельдерей," +
                        "f14 Соя,f25 Томат,f191 Тыква,s11 Укроп," +
                        "f47 Чеснок,f65 Чечевица,f38 Шпинат,f42 Щавель," +
                        "f239 Редька зеленая,f206 Фасоль красная,f151 Цукини,f46 Перец болгарский красный," +
                        "f15 Фасоль белая,f224 Свекла,s10 Базилик,f612 Зеленый горошек (консервированный)," +
                        "f100 Салат-латук,f132 Фасоль стручковая (лобио),f137 Спаржа NEW," +
                        "f784 Гидролизат говяжьего белка (говяжий протеин),f785 Изолят соевого белка (соевый протеин),f782 Концентрат молочного белка (мицеллярный казеин),f783 Концентрат сывороточного белка (сывороточный протеин)," +
                        "f786 Сухой яичный белок (яичный протеин)," +
                        "f739 Брынза коровья,f742 Брынза овечья,f250 Йогурт,f78 Bos d8 Казеин NEW," +
                        "f219 Молоко козье,f2 Молоко коровье цельное," +
                        "f168 Молоко сухое,f736 Сыр голландский,f746 Творог," +
                        "f737 Молочные сливки сухие,f769 Молоко топленое,f169 Молоко коровье кипяченое,f738 Сыр моцарелла," +
                        "f740 Ряженка,f76 Bos d4 Альфа- лактоальбумин NEW,f77 Bos d5 Бета- лактоглобулин NEW,f70 Сыр швейцарский," +
                        "f787 Молочная сыворотка,f81 Сыр чеддер," +
                        "f13 Арахис,f16 Грецкий орех,f197 Кедровый орех,f158 Кешью," +
                        "f36 Кокос,f20 Миндаль,f114 Семена подсолнечника,f144 Фисташки," +
                        "f17 Фундук,s5 Мускатный орех,f713 Арахис жареный,f98 Семена льна," +
                        "nf131 Ara h1 Арахис мажорный аллерген NEW," +
                        "f88 Баранина,f1 Белок куриного яйца нативный,f27 Говядина,f58 Мясо гуся," +
                        "f75 Желток куриного яйца нативный,f757 Животный белок,f130 Мясо индейки,f756 Колбаса вареная," +
                        "f754 Колбаса копченая,f167 Мясо кролика,f83 Мясо курицы,f755 Мясо нутрии," +
                        "f241 Печень говяжья,f26 Свинина,f57 Мясо утки,f252 Яйцо куриное цельное нативное," +
                        "f748 Яичный порошок,f184 Конина,f192 Перепелиное мясо,f165 Телятина," +
                        "f753 Яйцо перепелиное нативное,f701 Белок куриного яйца вареный,f750 Желток куриного яйца вареный,f752 Яйцо куриное цельное вареное," +
                        "f747 Яйцо перепелиное вареное,f68 Gal d1 Овомукоид NEW," +
                        "f97 Какао,f147 Каркаде,f759 Кока-кола,f95 Кофе молотый," +
                        "f795 Кофе растворимый,f758 Фанта,f266 Чай зеленый листовой," +
                        "f52 Шоколад," +
                        "f760 Заменитель сахара (сорбит),f277 Мед,f762 Сахар,f763 Сахар тростниковый (темный)," +
                        "f761 Фруктоза,f788 Стевия," +
                        "f765 Масло оливковое,f767 Масло подсолнечное,f768 Масло сливочное,f764 Масло кукурузное," +
                        "f159 Нут (турецкий горох),f789 Киноа,f790 Смесь бурого и дикого риса,," +
                        "f302 Вешенки,f770 Опята,f127 Шампиньоны," +
                        "f771 Фосфат-олбрайт,s16 Гвоздика,f79 Глютен (клейковина),f89 Горчица," +
                        "f45 Дрожжи пекарские,f772 Индигокармин,s17 Кориандр,f238 Крахмал," +
                        "s4 Лавровый лист,f128 Мак пищевой,s29 Перец красный острый,f43 Пивные дрожжи," +
                        "Sx1 Смесь специй,Ko4 Сорбиновая кислота,c112 Тартразин,s3 Тмин," +
                        "s7 Перец черный горошек,s2 Карри,s25 Имбирь,f773 Листья малины," +
                        "s8 Корица,f253 Корень хрена,f126 Мята,f774 Шафран," +
                        "f10 Кунжут,f155 Ванилин,s13 Тимьян,f225 Глутамат натрия," +
                        "e201 Bos d6 Бычий сывороточный альбумин NEW,s775 Кора дуба,s32 Перец душистый NEW," +
                        "f777 Нутрилак с пребиотиками,f776 Нутрилак безлактозный,f775 Каша гречневая Heinz,";
        return stri;
    }

}