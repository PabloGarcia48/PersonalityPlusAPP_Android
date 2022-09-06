package com.garcia.pablo.personalityplus.model.utils

import com.garcia.pablo.personalityplus.model.entities.BehaviorProfile
import com.garcia.pablo.personalityplus.model.entities.Exam
import com.garcia.pablo.personalityplus.model.entities.Option
import com.garcia.pablo.personalityplus.model.entities.Step

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

val options11 = listOf(
    Option(
        featureName = "Audacioso",
        description = "Gosta de se arriscar sem medo.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Encantador",
        description = "Uma pessoa feliz; é bom estar em sua companhia.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Diplomático",
        description = "Lida com as pessoas com tato, de forma sensível e paciente.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Minucioso",
        description = "Faz tudo na ordem correta, tem boa memória para tudo que acontece.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    )
)

val options12 = listOf(
    Option(
        featureName = "Alegre",
        description = "Constantemente de bom humor e promove a alegria nos outros.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Consistente",
        description = "Emocionalmente constante, reage da maneira que esperamos.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Culto",
        description = "Uma pessoa que se interessa por atividades tanto intelectuais quanto artísticas, tais como teatro, sinfonias, balé.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Confiante",
        description = "Seguro por natureza; tem certeza de sua própria habilidade e sucesso.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)

val options13 = listOf(
    Option(
        featureName = "Idealista",
        description = "Visualiza coisas como se fossem perfeitas; tem uma necessidade de estar à altura de seu próprio padrão.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Independente",
        description = "Auto-suficiente, apóia a si mesmo, autoconfiante e parece ter pouca necessidade de ajuda.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Inofensivo",
        description = "A pessoa que nunca diz ou causa algo desagradável ou censurável.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Inspirado",
        description = "Encoraja os outros a trabalhar, a participar ou estar envolvidos, e faz tudo ser divertido.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options14 = listOf(
    Option(
        featureName = "Demonstrativo",
        description = "Expressa emoções abertamente, especialmente sua afeição; não hesita em tocar os outros enquanto fala.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Decidido",
        description = "Uma pessoa com uma habilidade para fazer avaliações de forma rápida e conclusiva.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Irônico",
        description = "Demonstra ironia; pode ser sarcástico por natureza.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Profundo",
        description = "Intenso e freqüentemente introspectivo com  aversão a conversas e atividades superficiais.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    )
)

val options15 = listOf(
    Option(
        featureName = "Mediador",
        description = "Consistentemente se vê na situação de reconciliar diferenças a fim de evitar conflitos.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Musical",
        description = "Participa de ou tem profunda apreciação por música; mais comprometido com a música; ou com uma forma de arte do que com a alegria da performance.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Ativo",
        description = "Dirigido pela necessidade de ser produtivo, é um líder que os outros seguem, acha difícil ficar quieto.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Desembaraçado",
        description = "Adora uma festa e mal pode esperar para encontrar alguém no salão. Sempre encontra alguém conhecido.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options16 = listOf(
    Option(
        featureName = "Pensativo",
        description = "Uma pessoa ponderada que se lembra de ocasiões especiais e está pronta a fazer um gesto amável.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Tenaz",
        description = "Agarra-se firmemente, obstinadamente, e não desistirá até que o objetivo seja alcançado.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Conversador",
        description = "Fala constantemente, geralmente contando histórias engraçadas e divertindo a todos à sua volta; sente necessidade de preencher o silêncio a fim de fazer os outros ficarem confortáveis.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Tolerante",
        description = "Aceita facilmente os pensamentos e idéias dos outros sem a necessidade de discordar deles ou mudá-los.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    )
)

val options17 = listOf(
    Option(
        featureName = "Ouvinte",
        description = "Parece sempre estar querendo ouvir o que você tem a dizer.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Leal",
        description = "Fiel a uma pessoa, um ideal, ou um trabalho, muitas vezes além da razão.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Líder",
        description = "Um dirigente nato, levado a comandar, e freqüentemente acha difícil acreditar que outra pessoa possa fazer isso tão bem.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Vivo",
        description = "Cheio de vida, vigoroso, energético.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options18 = listOf(
    Option(
        featureName = "Contente",
        description = "Fica satisfeito facilmente com o que tem, raramente sente inveja.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Chefe",
        description = "Comanda e espera que todos os sigam.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Detalhista",
        description = "Organiza a vida, as atividades e soluções de problemas através de listas, formulários e gráficos.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Atraente",
        description = "Estimado, adorável, centro das atenções.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options19 = listOf(
    Option(
        featureName = "Perfeccionista",
        description = "Estipula altos padrões para ele mesmo e freqüentemente para os outros também; deseja que tudo esteja em perfeita ordem o tempo todo.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Agradável",
        description = "Desembaraçado, companhia agradável, fácil de conversar.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Produtivo",
        description = "Necessita estar constantemente trabalhando ou realizando algo, freqüentemente acha difícil descansar.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Popular",
        description = "Alma da festa e conseqüentemente um convidado muito requisitado.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options20 = listOf(
    Option(
        featureName = "Vivaz",
        description = "Uma personalidade cheia de vida, efervescente, cheia de energia.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Valente",
        description = "Sem medo, audacioso, avança sem medo de arriscar.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Comportado",
        description = "Deseja constantemente comportar-se dentro dos padrões que acha serem apropriados.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Equilibrado",
        description = "Estável, personalidade meio-termo, não sujeito a altos e baixos.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    )
)

val options21 = listOf(
    Option(
        featureName = "Vazio",
        description = "Uma pessoa que demonstra pouca  expressão ou emoção facial.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Acanhado",
        description = "Evita chamar a atenção, resultado de sua auto percepção.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Metido",
        description = "Pomposo, espalhafatoso, exagerado, barulhento.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Mandão",
        description = "Que comanda, dominador, às vezes oprime os outros em relacionamentos adultos.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)

val options22 = listOf(
    Option(
        featureName = "Indisciplinado",
        description = "Uma pessoa cuja falta de ordem permeia a maior parte das áreas de sua vida.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Insensível",
        description = "Acha difícil relacionar-se com os problemas ou mágoas dos outros.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Desinteressado",
        description = "Tende a não se animar, freqüentemente acha que não funcionaria de maneira nenhuma.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Rancoroso",
        description = "Alguém que acha difícil perdoar ou esquecer uma mágoa ou injustiça feita a ele, se agarra ao rancor.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    )
)

val options23 = listOf(
    Option(
        featureName = "Relutante",
        description = "Evita ou luta para não ser envolvido, especialmente quando é algo complexo.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Ressentido",
        description = "Freqüentemente carrega sentimentos doentios como resultado de ofensas reais e ilusórias.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Inflexível",
        description = "Empenha-se e trabalha contra; hesita em aceitar uma idéia que não seja a sua.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Repetitivo",
        description = "Conta novamente histórias e acontecimentos para entreter você, sem perceber que já contou essa história várias vezes; constantemente precisa estar falando.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options24 = listOf(
    Option(
        featureName = "Complicado",
        description = "Insiste em assuntos e detalhes insignificantes, dando muita atenção a detalhes triviais.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Medroso",
        description = "Freqüentemente vivencia sentimentos de profunda preocupação, apreensão ou ansiedade.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Esquecido",
        description = "Falta de memória que geralmente está ligada a uma falta de disciplina e não preocupação em gravar coisas que não são engraçadas.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Franco",
        description = "Honesto , comunicativo, e não se importa em contar exatamente o que pensa.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)

val options25 = listOf(
    Option(
        featureName = "Impaciente",
        description = "Uma pessoa que acha difícil tolerar a irritação ou esperar pelos outros.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Inseguro",
        description = "Alguém apreensivo ou que tem falta de confiança.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Indeciso",
        description = "Uma pessoa que acha difícil tomar qualquer decisão. (Não uma personalidade que trabalha duro até chegar na decisão perfeita).",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Inoportuno",
        description = "Uma pessoa que fala mais do que ouve, que começa a falar sem mesmo perceber que alguém já estava falando.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options26 = listOf(
    Option(
        featureName = "Impopular",
        description = "Uma pessoa cuja intensidade e busca pela perfeição afasta os outros.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Desligado",
        description = "Alguém que não gosta de ouvir ou se interessar por qualquer atividade, convívio social ou até mesmo a vida de outras pessoas.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Imprevisível",
        description = "Deseja ajudar mas em seguida desaparece: promete vir mas esquece de aparecer.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Frio",
        description = "Acha difícil demonstrar verbal ou fisicamente carinho sincero.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)

val options27 = listOf(
    Option(
        featureName = "Cabeçudo",
        description = "Insiste em sua forma de pensar.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Casual",
        description = "Tem uma forma inconsistente de fazer as coisas.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Insatisfeito",
        description = "Uma pessoa cujos padrões são tão altos que é praticamente impossível agradá-la.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Hesitante",
        description = "Lento para entrar em ação e difícil de se envolver.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    )
)

val options28 = listOf(
    Option(
        featureName = "Simples",
        description = "Uma personalidade meio-termo sem altos e baixos e que demonstra pouca, se alguma, emoção.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Pessimista",
        description = "Apesar de esperar o melhor, essa pessoa geralmente vê o lado pior da situação.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Orgulhoso",
        description = "Alguém com grande auto-estima que se vê como a pessoa que está sempre certa e a melhor pessoa para o emprego.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Permissivo",
        description = "Permite aos outros (incluindo as crianças) fazerem o que desejarem para que não deixem de gostar deles.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options29 = listOf(
    Option(
        featureName = "Esquentado",
        description = "Alguém que tem um temperamento facilmente irritável, que se expressa de forma furiosa e quando tudo acaba esquece quase instantaneamente.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Incerto",
        description = "Uma pessoa que não estabelece objetivos e não se importa com isso.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Combativo",
        description = "Incita discussões geralmente porque está certo, não importa qual seja a situação.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Alienado",
        description = "Geralmente fica afastado dos outros, freqüentemente por causa de insegurança ou medo de que os outros não gostem de sua companhia.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    )
)

val options30 = listOf(
    Option(
        featureName = "Ingênuo",
        description = "Visão simples e infantil, falta de sofisticação ou compreensão sobre quais sejam os profundos níveis da vida.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Negativo",
        description = "Alguém cuja atitude é raramente positiva e freqüentemente vê o lado triste ou negativo de cada situação.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Corajoso",
        description = "Cheio de confiança, coragem, freqüentemente em sentido negativo.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Indiferente",
        description = "Alienado, despreocupado, desinteressado.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    )
)

val options31 = listOf(
    Option(
        featureName = "Preocupado",
        description = "Sente-se freqüentemente indeciso, preocupado ou ansioso.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Retraído",
        description = "Uma pessoa voltada para si mesma que necessita de muito tempo sozinha ou isolada.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Workaholic",
        description = "Um energético trabalhador que precisa estar constantemente produzindo e se sente culpado quando descansa; não é guiado por uma necessidade de conclusão ou perfeição, mas por uma necessidade de realização e recompensa.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Egoísta",
        description = "Luta pelo crédito ou aprovação dos outros. Quando artista, essa pessoa se alimenta do aplauso, riso e/ou da aceitação do público.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options32 = listOf(
    Option(
        featureName = "Sensível demais",
        description = "Muito introspectivo e se ofende facilmente quando mal compreendido.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Indelicado",
        description = "Às vezes expressa-se de maneira ofensiva e imprudente.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Tímido",
        description = "Recua diante situações difíceis.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Tagarela",
        description = "Um falante alegre, compulsivo que acha difícil ouvir.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options33 = listOf(
    Option(
        featureName = "Confuso",
        description = "Suas características são a incerteza e a falta de confiança que as coisas vão funcionar.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Desorganizado",
        description = "Falta de habilidade de colocar sua vida em ordem.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Imperioso",
        description = "Compulsivamente toma o controle das situações ou pessoas, geralmente dizendo aos outros o que fazer.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Deprimido",
        description = "Uma pessoa que se sente desanimada a maior parte do tempo.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    )
)

val options34 = listOf(
    Option(
        featureName = "Inconstante",
        description = "Irregular, contraditório, com ações e emoções não baseadas na lógica.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Introvertido",
        description = "Uma pessoa cujos pensamentos e interesses são direcionados para seu íntimo, vive voltado para si.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Intolerante",
        description = "Parece incapaz de aceitar as atitudes, pontos de vista ou maneiras de fazer as coisas provenientes dos outros.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Apático",
        description = "Uma pessoa para quem não importa  se as coisas são feitas de uma maneira ou outra.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    )
)

val options35 = listOf(
    Option(
        featureName = "Desordenado",
        description = "Vive na desordem e é incapaz de encontrar as coisas.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Triste",
        description = "Não fica emocionado, mas facilmente entra em depressão quando sente que não é apreciado.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Resmungão",
        description = "Fala baixo e entre os dentes quando pressionado; não faz questão de falar claramente.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Manipulador",
        description = "Influencia e dirige de forma astuta ou tortuosa a fim de tirar vantagem para si mesmo; fará isso a qualquer custo.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)

val options36 = listOf(
    Option(
        featureName = "Lento",
        description = "Geralmente não age nem pensa rapidamente, seria muito incômodo.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Obstinado",
        description = "Determinado a exercer sua própria vontade; difícil de persuadir.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Convencido",
        description = "Precisa ser o centro das atenções, gosta de ser observado.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Cético",
        description = "Descrente, questiona o porquê das palavras.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    )
)

val options37 = listOf(
    Option(
        featureName = "Solitário",
        description = "Precisa de muito tempo sozinho e tende a evitar as pessoas.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Tirânico",
        description = "Não hesita em informar que está certo ou que está no comando.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Preguiçoso",
        description = "Avalia trabalhos ou atividades em termos de quanta energia irá necessitar.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Barulhento",
        description = "Uma pessoa cuja risada ou voz pode ser ouvida por todos na sala.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options38 = listOf(
    Option(
        featureName = "Vagaroso",
        description = "Lento para agir, precisa ser motivado.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Desconfiado",
        description = "Tende a suspeitar dos outros ou de suas idéias.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Irritável",
        description = "Tem uma raiva causada pela impaciência e exigência; além de possuir \"pavio curto\". A raiva é expressada quando os outros não estão se movendo rápido o suficiente ou não completaram o que foi solicitado por ele.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Distraído",
        description = "Falta de poder de atenção ou concentração, aleatório.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    )
)

val options39 = listOf(
    Option(
        featureName = "Vingativo",
        description = "Carrega ódio e pune as pessoas que ofendem; muitas vezes sonegando sutilmente sua amizade ou seu afeto.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Agitado",
        description = "Gosta de constantes atividades novas porque não é divertido fazer as mesmas coisas o tempo todo.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
    ),
    Option(
        featureName = "Relutante",
        description = "Não deseja ou luta para não ser envolvido.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Imprudente",
        description = "Pode agir precipitadamente sem pensar direito nas coisas, geralmente por causa da impaciência.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    )
)

val options40 = listOf(
    Option(
        featureName = "Acomodado",
        description = "Freqüentemente não sustentará a sua opinião, mesmo quando estiver certo, a fim de evitar conflitos.",
        behaviorProfile = BehaviorProfile.SERENO_FLEUMATICO,
    ),
    Option(
        featureName = "Crítico",
        description = "Constantemente está avaliando e fazendo julgamentos; freqüentemente está pensando ou tendo reações negativas.",
        behaviorProfile = BehaviorProfile.PERFEITO_MELANCOLICO,
    ),
    Option(
        featureName = "Astuto",
        description = "Inteligente, alguém que sempre pode encontrar uma maneira de alcançar o que deseja.",
        behaviorProfile = BehaviorProfile.FORTE_COLERICO,
    ),
    Option(
        featureName = "Instável",
        description = "Infantil, que precisa de muita mudança e variedade para não ficar aborrecido.",
        behaviorProfile = BehaviorProfile.POPULAR_SANGUINEO,
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
    options = options9
)

val step10 = Step(
    options = options10
)

val step11 = Step(
    options = options11
)

val step12 = Step(
    options = options12
)

val step13 = Step(
    options = options13
)

val step14 = Step(
    options = options14
)

val step15 = Step(
    options = options15
)

val step16 = Step(
    options = options16
)

val step17 = Step(
    options = options17
)

val step18 = Step(
    options = options18
)

val step19 = Step(
    options = options19
)

val step20 = Step(
    options = options20
)

val step21 = Step(
    options = options21
)

val step22 = Step(
    options = options22
)

val step23 = Step(
    options = options23
)

val step24 = Step(
    options = options24
)

val step25 = Step(
    options = options25
)

val step26 = Step(
    options = options26
)

val step27 = Step(
    options = options27
)

val step28 = Step(
    options = options28
)

val step29 = Step(
    options = options29
)

val step30 = Step(
    options = options30
)

val step31 = Step(
    options = options31
)

val step32 = Step(
    options = options32
)

val step33 = Step(
    options = options33
)

val step34 = Step(
    options = options34
)

val step35 = Step(
    options = options35
)

val step36 = Step(
    options = options36
)

val step37 = Step(
    options = options37
)

val step38 = Step(
    options = options38
)

val step39 = Step(
    options = options39
)

val step40 = Step(
    options = options40
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
        step10,
        step11,
        step12,
        step13,
        step14,
        step15,
        step16,
        step17,
        step18,
        step19,
        step20,
        step21,
        step22,
        step23,
        step24,
        step25,
        step26,
        step27,
        step28,
        step29,
        step30,
        step31,
        step32,
        step33,
        step34,
        step35,
        step36,
        step37,
        step38,
        step39,
        step40
    )
)