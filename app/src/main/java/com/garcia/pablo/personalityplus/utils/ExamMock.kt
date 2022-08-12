package com.garcia.pablo.personalityplus.utils

import com.garcia.pablo.personalityplus.entities.BehaviorProfile
import com.garcia.pablo.personalityplus.entities.Exam
import com.garcia.pablo.personalityplus.entities.Option
import com.garcia.pablo.personalityplus.entities.Step

val options1 = listOf(
    Option(
        featureName = "Aventureiro",
        description = "É a pessoa que participará de novos e audaciosos empreendimentos com determinação de controlá-los.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Adaptável",
        description = "Facilmente se adapta e se sente confortável em qualquer situação.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Animado",
        description = "Cheio de vida, movimenta vigorosamente as mãos e os braços.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Analítico",
        description = "Gosta de examinar as partes para relacionamentos lógicos e apropriados.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    )
)

val options2 = listOf(
    Option(
        featureName = "Persistente",
        description = "Visualiza um projeto realizado antes de começar outro.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Brincalhão",
        description = "Cheio de alegria e bom humor.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Persuasivo",
        description = "Convence mais através da lógica e fatos do que de charme ou poder.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Sereno",
        description = "Parece calmo e tranqüilo e se afasta de qualquer forma de discussão.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    )
)

val options3 = listOf(
    Option(
        featureName = "Submisso",
        description = "Aceita facilmente o ponto de vista ou os desejos dos outros e tem pouca necessidade de afirmar sua própria opinião.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Abnegado",
        description = "Quer desistir de sua própria vida, pelo bem dos outros ou para encontrar as necessidades dos outros.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Sociável",
        description = "Alguém que acha que estar com outras pessoas é muito mais uma oportunidade de ser atraente e animado do que um simples desafio ou oportunidade de negócios.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Energético",
        description = "Alguém que está determinado a fazer da sua própria maneira.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)

val options4 = listOf(
    Option(
        featureName = "Atencioso",
        description = "Importa-se com as necessidades e sentimentos dos outros.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Controlado",
        description = "Tem sentimentos, mas raramente os demonstra.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Competitivo",
        description = "Transforma toda situação, acontecimento ou jogo numa competição e sempre joga para vencer.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Convincente",
        description = "Pode vencer você de qualquer coisa através do absoluto charme de sua personalidade.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options5 = listOf(
    Option(
        featureName = "Refrescante",
        description = "Renova e estimula, ou faz com que os outros se sintam bem.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Respeitoso",
        description = "Trata os outros com respeito, honra e estima.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Reservado",
        description = "Impede a si mesmo de expressar emoções e entusiasmo.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Habilidoso",
        description = "Capaz de agir rápida e eficazmente em qualquer situação.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)
val options6 = listOf(
    Option(
        featureName = "Satisfeito",
        description = "A pessoa que facilmente aceita qualquer situação ou circunstância.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Sensível",
        description = "Preocupa-se intensamente com os outros e com o que acontece.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Auto-suficiente",
        description = "Uma pessoa independente que pode contar plenamente com suas próprias capacidades, julgamentos e recursos.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Espirituoso",
        description = "Cheio de vida e entusiasmo.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options7 = listOf(
    Option(
        featureName = "Planejador",
        description = "Prefere trabalhar um plano detalhado com antecedência, para a realização de um projeto ou objetivo, e prefere envolver-se com os estágios de planejamento e com o produto final mais do que na execução da tarefa.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Paciente",
        description = "Inabalável por alguma demora; permanece calmo e tolerante.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Positivo",
        description = "Sabe que tudo dará certo, se ele estiver no comando.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Estimulador",
        description = "Impulsiona ou obriga os outros a se unirem, investirem e participarem utilizando-se do charme de sua própria personalidade.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options8 = listOf(
    Option(
        featureName = "Seguro",
        description = "Confiante, raramente hesita ou fica indeciso.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Espontâneo",
        description = "Prefere que tudo na vida seja impulsivo, atividade não-premeditada, não restrito por planos.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Organizado",
        description = "Age e vive de acordo com um plano diário e não gosta que seu plano seja interrompido.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Tímido",
        description = "Quieto, não instiga facilmente uma conversa.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    )
)
val options9 = listOf(
    Option(
        featureName = "Ordeiro",
        description = "Uma pessoa que tem um plano metódico e sistemático para as coisas.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Serviçal",
        description = "Acomodado. Alguém que rapidamente faz como a outra pessoa quer.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Franco",
        description = "Fala francamente e sem restrição.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Otimista",
        description = "Radiante disposição para convencer a ele mesmo e aos outros de que tudo dará certo.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options10 = listOf(
    Option(
        featureName = "Amigável",
        description = "Gosta mais de responder do que perguntar, raramente inicia uma conversa.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Fiel",
        description = "Sempre confiável, imutável, leal e muitas vezes devotado além da razão.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Engraçado",
        description = "Brilhante senso de humor que pode transformar qualquer história em um evento hilariante.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Vigoroso",
        description = "Uma personalidade de comando que os outros hesitariam em contrariar.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)

val optionsN = listOf(
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "",
        description = "",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)

val step1 = Step(
    options = options1
)

val step2 = Step(
    options = options2
)

val step3 = Step(
    options = options3
)

val step4 = Step(
    options = options4
)

val step5 = Step(
    options = options5
)

val step6 = Step(
    options = options6
)

val step7 = Step(
    options = options7
)

val step8 = Step(
    options = options8
)

val step9 = Step(
    options = options8
)

val step10 = Step(
    options = options8
)

val examMock = Exam(
    steps = listOf(
        step1,
        step2,
        step3,
        step4,
        step5,
        step6,
        step7,
        step8,
        step9,
        step10
    )
)