/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;



/**
 *
 * @author JhéssikLeal
 */
public class Signos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signos.class.getName());

    /**
     * Creates new form Signos
     */
    public Signos() {
        initComponents();
        RedimensionarImagens();
        PreencherPrevisao();
        PreencherMensagem();
       
       
    }

    // TODA FUNÇÃO É CRIADA ABAIXO DO CONSTRUTOR
    
    public void RedimensionarImagens(){
        // capturar as imagens que estão dentro da label
        ImageIcon aries = (ImageIcon) imgSignoAries.getIcon();
        ImageIcon touro = (ImageIcon) imgSignoTouro.getIcon();
        ImageIcon gemeos = (ImageIcon) imgSignoGemeos.getIcon();
        ImageIcon cancer = (ImageIcon) imgSignoCancer.getIcon();
        ImageIcon leao = (ImageIcon) imgSignoLeao.getIcon();
        ImageIcon virgem = (ImageIcon) imgSignoVirgem.getIcon();
        ImageIcon libra = (ImageIcon) imgSignoLibra.getIcon();
        ImageIcon escorpiao = (ImageIcon) imgSignoEscorpiao.getIcon();
        ImageIcon sagitario = (ImageIcon) imgSignoSagitario.getIcon();
        ImageIcon capricornio = (ImageIcon) imgSignoCapricornio.getIcon();
        ImageIcon aquario = (ImageIcon) imgSignoAquario.getIcon();
        ImageIcon peixes = (ImageIcon) imgSignoPeixes.getIcon();
        
        // REDIMENSIONAR AS IMAGENS
        Image imgAries = aries.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        Image imgTouro = touro.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        Image imgGemeos = gemeos.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        Image imgCancer = cancer.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        Image imgLeao = leao.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        Image imgVirgem = virgem.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        Image imgLibra = libra.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        Image imgEscorpiao = escorpiao.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        Image imgSagitario = sagitario.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        Image imgCapricornio = capricornio.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        Image imgAquario = aquario.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        Image imgPeixes = peixes.getImage().getScaledInstance(
                400, 700, Image.SCALE_SMOOTH);

        // INSERIR AS IMAGENS REDIMENSIONADAS NAS LABELS
        imgSignoAries.setIcon(new ImageIcon(imgAries));
        imgSignoTouro.setIcon(new ImageIcon(imgTouro));
        imgSignoGemeos.setIcon(new ImageIcon(imgGemeos));
        imgSignoCancer.setIcon(new ImageIcon(imgCancer));
        imgSignoLeao.setIcon(new ImageIcon(imgLeao));
        imgSignoVirgem.setIcon(new ImageIcon(imgVirgem));
        imgSignoLibra.setIcon(new ImageIcon(imgLibra));
        imgSignoEscorpiao.setIcon(new ImageIcon(imgEscorpiao));
        imgSignoSagitario.setIcon(new ImageIcon(imgSagitario));
        imgSignoCapricornio.setIcon(new ImageIcon(imgCapricornio));
        imgSignoAquario.setIcon(new ImageIcon(imgAquario));
        imgSignoPeixes.setIcon(new ImageIcon(imgPeixes));
        
    }// fim da função
    
    public void PreencherPrevisao() {
    // Verificar o dia da semana. LocalDate puxa a data do computador.
    int diaSemana = LocalDate.now().getDayOfWeek().getValue();

    // Preencher os campos com previsões fictícias para o aplicativo.
    switch (diaSemana) {
        case 1: // Segunda-feira
            txtPrevisaoAries.setText("Comece a semana com iniciativa! Organize suas prioridades e use sua energia para dar o primeiro passo em um projeto.");
            txtPrevisaoTouro.setText("O dia pede organização e tranquilidade. Planeje suas tarefas e avance no seu ritmo, valorizando cada pequena conquista.");
            txtPrevisaoGemeos.setText("Sua comunicação pode abrir caminhos. Compartilhe ideias, escute outras opiniões e aproveite para aprender algo novo.");
            txtPrevisaoCancer.setText("Comece a semana cuidando de você e de quem está por perto. Uma conversa acolhedora pode tornar o dia mais leve.");
            txtPrevisaoLeao.setText("Sua criatividade merece espaço. Mostre suas ideias com confiança e valorize também as contribuições das outras pessoas.");
            txtPrevisaoVirgem.setText("Organize sua rotina e estabeleça metas possíveis. Resolver uma tarefa de cada vez ajudará você a manter o foco.");
            txtPrevisaoLibra.setText("Busque equilíbrio entre suas responsabilidades e seus momentos de descanso. O diálogo será um bom aliado nas decisões.");
            txtPrevisaoEscorpiao.setText("Direcione sua determinação para o que realmente importa. Evite agir por impulso e observe as situações com calma.");
            txtPrevisaoSagitario.setText("A semana começa com espaço para novas descobertas. Transforme sua vontade de aprender em uma pequena ação prática.");
            txtPrevisaoCapricornio.setText("Defina suas prioridades e prepare um plano para a semana. A constância pode ajudar você a se aproximar dos seus objetivos.");
            txtPrevisaoAquario.setText("Uma ideia diferente pode renovar sua rotina. Anote suas inspirações e escolha uma delas para desenvolver com atenção.");
            txtPrevisaoPeixes.setText("Use sua sensibilidade para perceber suas necessidades. Comece o dia com calma e reserve um momento para sua criatividade.");
            break;

        case 2: // Terça-feira
            txtPrevisaoAries.setText("Canalize sua energia para concluir uma tarefa pendente. Nas conversas, pratique a paciência e dê espaço para o outro falar.");
            txtPrevisaoTouro.setText("Cuide do que você vem construindo. Pequenos ajustes na rotina podem trazer mais conforto e facilitar suas atividades.");
            txtPrevisaoGemeos.setText("Seu interesse por novidades pode render boas ideias. Para não se dispersar, escolha uma prioridade e dedique atenção a ela.");
            txtPrevisaoCancer.setText("Demonstre carinho por meio de atitudes simples. Também vale expressar suas necessidades com clareza e gentileza.");
            txtPrevisaoLeao.setText("Use sua confiança para enfrentar um desafio. Trabalhar em parceria pode deixar o caminho mais agradável e produtivo.");
            txtPrevisaoVirgem.setText("Observe os detalhes, mas não deixe a busca pela perfeição impedir seu progresso. Faça o melhor possível com o tempo disponível.");
            txtPrevisaoLibra.setText("Uma conversa tranquila pode ajudar a esclarecer uma dúvida. Considere diferentes opiniões sem esquecer o que é importante para você.");
            txtPrevisaoEscorpiao.setText("O dia convida à concentração. Dedique-se a uma atividade importante e procure compreender os fatos antes de tirar conclusões.");
            txtPrevisaoSagitario.setText("Experimente uma maneira diferente de realizar suas tarefas. A novidade pode trazer motivação, desde que você mantenha seus compromissos.");
            txtPrevisaoCapricornio.setText("Reconheça o esforço que você já fez. Reorganize o que for necessário e continue avançando sem exigir resultados imediatos.");
            txtPrevisaoAquario.setText("Compartilhar ideias pode enriquecer seus projetos. Esteja aberto a sugestões e transforme uma inspiração em algo concreto.");
            txtPrevisaoPeixes.setText("Dê espaço à imaginação, mantendo atenção às tarefas do dia. Uma lista simples pode ajudar a organizar suas ideias.");
            break;

        case 3: // Quarta-feira
            txtPrevisaoAries.setText("Faça uma pausa para avaliar o andamento da semana. Ajustar seus planos pode ser mais útil do que tentar resolver tudo de uma vez.");
            txtPrevisaoTouro.setText("Valorize a constância, mas permita pequenas mudanças. Uma nova forma de fazer algo pode tornar sua rotina mais leve.");
            txtPrevisaoGemeos.setText("A troca de conhecimentos pode movimentar seu dia. Tire dúvidas e procure concluir uma ideia antes de começar outra.");
            txtPrevisaoCancer.setText("Observe como você está se sentindo e respeite seus limites. Um momento de tranquilidade pode ajudar a reorganizar seus pensamentos.");
            txtPrevisaoLeao.setText("Reconheça suas conquistas e compartilhe o mérito com quem ajudou. A generosidade pode fortalecer suas relações.");
            txtPrevisaoVirgem.setText("Revise suas tarefas e simplifique o que puder. Nem tudo precisa sair exatamente como você planejou para ter valor.");
            txtPrevisaoLibra.setText("Procure equilibrar o tempo dedicado aos outros e a você. Dizer o que precisa com respeito pode evitar mal-entendidos.");
            txtPrevisaoEscorpiao.setText("Use sua persistência para superar uma dificuldade. Se algo não estiver funcionando, considere mudar a estratégia.");
            txtPrevisaoSagitario.setText("Encontre motivação em uma nova pergunta ou descoberta. Aproveite a curiosidade para aprofundar um assunto de seu interesse.");
            txtPrevisaoCapricornio.setText("Confira o que já foi realizado e reorganize as próximas etapas. Inclua pausas no planejamento para manter um ritmo sustentável.");
            txtPrevisaoAquario.setText("Seu olhar criativo pode ajudar a resolver um problema cotidiano. Teste uma solução simples e observe o resultado.");
            txtPrevisaoPeixes.setText("Transforme sua inspiração em uma atividade prática. Escrever, desenhar ou ouvir música pode tornar o dia mais agradável.");
            break;

        case 4: // Quinta-feira
            txtPrevisaoAries.setText("Tome a iniciativa em uma tarefa que você vem adiando. Antes de agir, pense nas etapas e nas pessoas envolvidas.");
            txtPrevisaoTouro.setText("O dia favorece o cuidado com seus projetos pessoais. Reserve um tempo para algo que traga satisfação e tenha significado para você.");
            txtPrevisaoGemeos.setText("Expresse suas ideias com clareza e atenção. Escutar até o fim pode ser tão importante quanto encontrar as palavras certas.");
            txtPrevisaoCancer.setText("Aproxime-se de pessoas com quem você se sente à vontade. Uma troca sincera pode trazer acolhimento e novas perspectivas.");
            txtPrevisaoLeao.setText("Coloque sua criatividade em movimento. Encare um desafio com confiança, mantendo abertura para aprender durante o processo.");
            txtPrevisaoVirgem.setText("Aproveite para resolver pequenas pendências. Organizar seu espaço pode facilitar a concentração nas próximas atividades.");
            txtPrevisaoLibra.setText("Reflita sobre uma decisão com calma. Considere suas prioridades e evite assumir compromissos apenas para agradar.");
            txtPrevisaoEscorpiao.setText("Observe suas reações antes de responder a uma situação difícil. Uma atitude ponderada pode tornar a conversa mais construtiva.");
            txtPrevisaoSagitario.setText("Dê um passo em direção a um objetivo que desperte entusiasmo. Planejar os detalhes ajudará a transformar vontade em ação.");
            txtPrevisaoCapricornio.setText("Sua dedicação ganha sentido quando você reconhece o próprio progresso. Valorize as etapas concluídas e ajuste as expectativas.");
            txtPrevisaoAquario.setText("Busque colaboração para desenvolver uma ideia. Diferentes pontos de vista podem revelar possibilidades que você ainda não considerou.");
            txtPrevisaoPeixes.setText("Use sua empatia nas relações, sem deixar suas necessidades de lado. Encontre um momento para descansar e reorganizar as ideias.");
            break;

        case 5: // Sexta-feira
            txtPrevisaoAries.setText("Concentre sua energia nas prioridades que ainda precisam de atenção. Depois, permita-se aproveitar um momento de diversão.");
            txtPrevisaoTouro.setText("Finalize o que estiver ao seu alcance e valorize o esforço da semana. Um programa tranquilo pode ser uma boa forma de relaxar.");
            txtPrevisaoGemeos.setText("O dia convida a conversas leves e boas trocas. Organize as pendências antes de se envolver em novos planos.");
            txtPrevisaoCancer.setText("Celebre os pequenos momentos e procure companhia acolhedora. Respeite também sua vontade de ficar em um ambiente tranquilo.");
            txtPrevisaoLeao.setText("Compartilhe sua alegria e reconheça as conquistas das pessoas próximas. Um encontro descontraído pode deixar o dia especial.");
            txtPrevisaoVirgem.setText("Encerre a semana reconhecendo o que foi possível realizar. Deixe anotado o que ficou para depois e aproveite seu descanso.");
            txtPrevisaoLibra.setText("Reserve espaço para atividades que tragam prazer e equilíbrio. Escolha um programa que combine com sua disposição.");
            txtPrevisaoEscorpiao.setText("Deixe as preocupações de lado por alguns instantes e observe o que trouxe satisfação nesta semana. Valorize suas boas experiências.");
            txtPrevisaoSagitario.setText("Sua vontade de sair da rotina pode inspirar um programa diferente. Explore possibilidades e combine os planos com responsabilidade.");
            txtPrevisaoCapricornio.setText("Reconheça o trabalho realizado e estabeleça um limite para encerrar as tarefas. Descansar também faz parte de uma boa rotina.");
            txtPrevisaoAquario.setText("Uma atividade diferente pode renovar seu ânimo. Convide alguém para compartilhar uma ideia, um jogo ou uma conversa.");
            txtPrevisaoPeixes.setText("Encontre leveza em algo simples, como uma música ou uma boa conversa. Dê atenção ao que ajuda você a se sentir bem.");
            break;

        case 6: // Sábado
            txtPrevisaoAries.setText("Aproveite o dia para movimentar seus projetos pessoais ou experimentar um hobby. Escolha algo que combine com sua energia.");
            txtPrevisaoTouro.setText("Desfrute dos pequenos prazeres com calma. Cuidar do seu espaço ou preparar algo de que gosta pode tornar o dia agradável.");
            txtPrevisaoGemeos.setText("Explore sua curiosidade em uma leitura, passeio ou conversa. Permita-se descobrir algo sem a obrigação de dominar tudo.");
            txtPrevisaoCancer.setText("Dedique tempo aos vínculos que fazem bem a você. Um gesto de carinho pode tornar um momento comum mais especial.");
            txtPrevisaoLeao.setText("Expresse sua criatividade e aproveite atividades que tragam alegria. O dia pode ganhar cor com um projeto feito por prazer.");
            txtPrevisaoVirgem.setText("Equilibre pequenas tarefas com momentos de lazer. Permita que parte do dia aconteça sem um planejamento detalhado.");
            txtPrevisaoLibra.setText("Busque ambientes e companhias que tragam tranquilidade. Aproveite para apreciar arte, música ou uma conversa agradável.");
            txtPrevisaoEscorpiao.setText("Reserve tempo para um interesse pessoal. Dedicar atenção ao que você gosta pode ser uma boa maneira de aproveitar o sábado.");
            txtPrevisaoSagitario.setText("Saia um pouco da rotina e conheça algo diferente. Uma descoberta simples já pode despertar seu entusiasmo.");
            txtPrevisaoCapricornio.setText("Dê espaço à vida além das obrigações. Um hobby ou um momento com pessoas queridas pode tornar seu dia mais leve.");
            txtPrevisaoAquario.setText("Experimente criar, inventar ou aprender algo por diversão. Compartilhar essa experiência pode render boas lembranças.");
            txtPrevisaoPeixes.setText("Aproveite sua imaginação em uma atividade artística ou relaxante. Respeite seu ritmo e escolha um programa acolhedor.");
            break;

        case 7: // Domingo
            txtPrevisaoAries.setText("Desacelere e escolha suas prioridades para a próxima semana. Um planejamento simples pode ajudar a direcionar sua energia.");
            txtPrevisaoTouro.setText("Aproveite o domingo para descansar e organizar apenas o necessário. Valorize a tranquilidade e os momentos de conforto.");
            txtPrevisaoGemeos.setText("Dê uma pausa no excesso de informações. Escolha uma atividade leve e anote as ideias que quiser retomar durante a semana.");
            txtPrevisaoCancer.setText("Cuide do seu espaço e dos vínculos importantes. Um momento de acolhimento pode ajudar a encerrar a semana com serenidade.");
            txtPrevisaoLeao.setText("Reconheça algo de que você se orgulha nesta semana. Reserve tempo para descansar e aproveitar a companhia de quem você gosta.");
            txtPrevisaoVirgem.setText("Prepare o básico para os próximos dias sem ocupar todo o domingo. Deixe espaço para o descanso e para os imprevistos.");
            txtPrevisaoLibra.setText("Reflita sobre o equilíbrio da sua rotina. Pense em uma pequena mudança que permita cuidar melhor dos seus interesses.");
            txtPrevisaoEscorpiao.setText("Reveja a semana com gentileza e identifique o que aprendeu. Escolha o que deseja levar adiante e o que pode deixar para trás.");
            txtPrevisaoSagitario.setText("Imagine novas possibilidades e escolha uma meta possível para a semana. Aproveite o presente antes de pensar na próxima aventura.");
            txtPrevisaoCapricornio.setText("Planeje os próximos dias com metas realistas. Lembre-se de incluir tempo para você e para as pessoas importantes.");
            txtPrevisaoAquario.setText("Organize suas ideias e selecione uma para explorar nos próximos dias. Aproveite o domingo para renovar suas inspirações.");
            txtPrevisaoPeixes.setText("Encerre a semana com calma e atenção aos seus sentimentos. Uma atividade tranquila pode ajudar a preparar o ânimo para recomeçar.");
            break;
    }
} // Fim do método
   
    public void PreencherMensagem() {
    // CAPTURAR DIA DA SEMANA
    int diaSemana = LocalDate.now().getDayOfWeek().getValue();

    // PREENCHER AS MENSAGENS DE TODOS OS SIGNOS
    switch (diaSemana) {
        case 1: // Segunda-feira
            txtMensagemAries.setText("Tenha coragem para começar e paciência para continuar.");
            txtMensagemTouro.setText("Cada pequeno passo também faz parte de uma grande conquista.");
            txtMensagemGemeos.setText("Aprender algo novo é abrir uma janela para o mundo.");
            txtMensagemCancer.setText("Ofereça a si mesmo o carinho que você dedica aos outros.");
            txtMensagemLeao.setText("Deixe sua luz aparecer nas atitudes que fazem a diferença.");
            txtMensagemVirgem.setText("Comece com o que você tem e aperfeiçoe ao longo do caminho.");
            txtMensagemLibra.setText("O equilíbrio começa quando você também escuta suas necessidades.");
            txtMensagemEscorpiao.setText("Use sua força para construir o que deseja viver.");
            txtMensagemSagitario.setText("Transforme a vontade de descobrir em coragem para aprender.");
            txtMensagemCapricornio.setText("Um objetivo fica mais próximo quando você dá o primeiro passo.");
            txtMensagemAquario.setText("Suas ideias merecem a oportunidade de sair do papel.");
            txtMensagemPeixes.setText("Dê espaço aos seus sonhos e um pequeno passo na direção deles.");
            break;

        case 2: // Terça-feira
            txtMensagemAries.setText("Agir com calma também é uma demonstração de força.");
            txtMensagemTouro.setText("Respeite seu ritmo sem perder de vista seus objetivos.");
            txtMensagemGemeos.setText("Uma boa conversa começa com a disposição para escutar.");
            txtMensagemCancer.setText("Pequenos gestos de carinho podem transformar um dia comum.");
            txtMensagemLeao.setText("Confie no seu valor, mesmo quando não houver aplausos.");
            txtMensagemVirgem.setText("Seu esforço tem valor, mesmo quando o resultado não é perfeito.");
            txtMensagemLibra.setText("Ser gentil não exige deixar suas próprias vontades de lado.");
            txtMensagemEscorpiao.setText("Mudar de estratégia pode ser o caminho para seguir em frente.");
            txtMensagemSagitario.setText("Encontre uma descoberta nas pequenas experiências do cotidiano.");
            txtMensagemCapricornio.setText("A constância cresce quando suas metas respeitam seus limites.");
            txtMensagemAquario.setText("Uma ideia compartilhada pode ganhar novas possibilidades.");
            txtMensagemPeixes.setText("Sua sensibilidade pode ser uma ponte para compreender o outro.");
            break;

        case 3: // Quarta-feira
            txtMensagemAries.setText("Antes de acelerar, confira se está seguindo a direção que deseja.");
            txtMensagemTouro.setText("Permita-se mudar sem desvalorizar tudo o que já construiu.");
            txtMensagemGemeos.setText("Concentre sua atenção no que merece ser concluído hoje.");
            txtMensagemCancer.setText("Reconhecer o que você sente é uma forma de cuidar de si.");
            txtMensagemLeao.setText("Celebrar a conquista de outra pessoa não diminui a sua.");
            txtMensagemVirgem.setText("Você pode fazer um bom trabalho sem controlar cada detalhe.");
            txtMensagemLibra.setText("Sua opinião merece espaço nas decisões que envolvem sua vida.");
            txtMensagemEscorpiao.setText("Nem toda resposta precisa ser imediata; permita-se refletir.");
            txtMensagemSagitario.setText("A curiosidade ganha força quando vem acompanhada de dedicação.");
            txtMensagemCapricornio.setText("Reconheça o caminho percorrido antes de cobrar o próximo passo.");
            txtMensagemAquario.setText("Observe o cotidiano: uma solução pode começar em uma pergunta.");
            txtMensagemPeixes.setText("Transforme uma inspiração de hoje em algo que você possa criar.");
            break;

        case 4: // Quinta-feira
            txtMensagemAries.setText("Coragem também é admitir uma dúvida e pedir ajuda.");
            txtMensagemTouro.setText("Cuide do que importa, mas deixe espaço para o novo.");
            txtMensagemGemeos.setText("Escolha palavras que esclareçam e aproximem.");
            txtMensagemCancer.setText("Você pode acolher alguém sem carregar todos os problemas dessa pessoa.");
            txtMensagemLeao.setText("Liderar também é abrir espaço para outras pessoas brilharem.");
            txtMensagemVirgem.setText("Simplificar uma tarefa pode ser melhor do que exigir mais de si.");
            txtMensagemLibra.setText("Uma decisão consciente vale mais do que agradar a todos.");
            txtMensagemEscorpiao.setText("Direcione sua intensidade para algo que faça sentido para você.");
            txtMensagemSagitario.setText("Sonhar com o futuro fica mais interessante quando você age no presente.");
            txtMensagemCapricornio.setText("Disciplina e descanso podem fazer parte do mesmo planejamento.");
            txtMensagemAquario.setText("Escutar uma opinião diferente pode enriquecer sua própria ideia.");
            txtMensagemPeixes.setText("Cuidar dos seus limites também é um gesto de amor.");
            break;

        case 5: // Sexta-feira
            txtMensagemAries.setText("Valorize o que conseguiu realizar e permita-se respirar.");
            txtMensagemTouro.setText("Aprecie as pequenas conquistas que sua dedicação tornou possíveis.");
            txtMensagemGemeos.setText("Compartilhe uma boa ideia e guarde espaço para uma boa risada.");
            txtMensagemCancer.setText("Encontre alegria nos encontros e nos gestos mais simples.");
            txtMensagemLeao.setText("Celebre suas vitórias sem precisar compará-las às de ninguém.");
            txtMensagemVirgem.setText("O que ficou pendente não apaga tudo o que você já fez.");
            txtMensagemLibra.setText("Escolha um momento do dia para fazer algo de que você gosta.");
            txtMensagemEscorpiao.setText("Dê atenção ao que trouxe leveza para sua semana.");
            txtMensagemSagitario.setText("A alegria pode estar em um plano simples com uma boa companhia.");
            txtMensagemCapricornio.setText("Seu valor vai além da quantidade de tarefas que você conclui.");
            txtMensagemAquario.setText("Deixe a criatividade participar também dos seus momentos de lazer.");
            txtMensagemPeixes.setText("Permita-se apreciar o presente sem resolver tudo de uma vez.");
            break;

        case 6: // Sábado
            txtMensagemAries.setText("Use sua energia para viver algo que desperte seu entusiasmo.");
            txtMensagemTouro.setText("Desacelere o suficiente para perceber o que faz bem a você.");
            txtMensagemGemeos.setText("Explore uma curiosidade sem transformar a descoberta em obrigação.");
            txtMensagemCancer.setText("Uma lembrança feliz pode começar com um momento de atenção.");
            txtMensagemLeao.setText("Faça algo por prazer, mesmo que ninguém esteja olhando.");
            txtMensagemVirgem.setText("Você também merece um dia com menos cobranças.");
            txtMensagemLibra.setText("Reserve tempo para as pessoas e atividades que trazem paz.");
            txtMensagemEscorpiao.setText("Permita-se viver momentos leves sem precisar explicar tudo.");
            txtMensagemSagitario.setText("Descobrir algo diferente pode começar bem perto de você.");
            txtMensagemCapricornio.setText("Descansar não diminui sua dedicação; faz parte de cuidar de si.");
            txtMensagemAquario.setText("Experimente uma ideia divertida e aproveite o processo.");
            txtMensagemPeixes.setText("Encontre beleza nos detalhes que a pressa costuma esconder.");
            break;

        case 7: // Domingo
            txtMensagemAries.setText("Prepare o próximo passo, mas aproveite o lugar onde está agora.");
            txtMensagemTouro.setText("Que seu descanso tenha o mesmo espaço que seus compromissos.");
            txtMensagemGemeos.setText("Dê uma pausa às informações e escute seus próprios pensamentos.");
            txtMensagemCancer.setText("Crie um momento de acolhimento para encerrar sua semana.");
            txtMensagemLeao.setText("Lembre-se de uma atitude sua que merece reconhecimento.");
            txtMensagemVirgem.setText("Planeje o necessário e deixe espaço para a vida acontecer.");
            txtMensagemLibra.setText("Recomeçar pode ser escolher uma rotina mais equilibrada.");
            txtMensagemEscorpiao.setText("Leve os aprendizados da semana, sem carregar todas as cobranças.");
            txtMensagemSagitario.setText("Escolha um motivo para se animar com os próximos dias.");
            txtMensagemCapricornio.setText("Defina metas possíveis e reconheça cada etapa do caminho.");
            txtMensagemAquario.setText("Guarde uma ideia que você gostaria de explorar na próxima semana.");
            txtMensagemPeixes.setText("Recomece com gentileza e respeite o tempo de cada passo.");
            break;
    } // Fim do switch
} // Fim do PreencherMensagem
    
    public void CorrigirAreasTextos(){
        
        txtMensagemAries.setLineWrap(true);
        txtMensagemAries.setWrapStyleWord(true);
        
         txtPrevisaoAries.setLineWrap(true);
         txtPrevisaoAries.setWrapStyleWord(true);
         
         txFortesAries.setLineWrap(true);
         txFortesAries.setWrapStyleWord(true);
         
         txMelhorarAries.setLineWrap(true);
         txMelhorarAries.setWrapStyleWord(true);
         
    }
    
    public void CalcularSigno() {

    int dia = Integer.parseInt(cbDia.getSelectedItem().toString());
    String mes = cbMes.getSelectedItem().toString();
    ImageIcon imagem = null;
    // Áries
    if ((mes.equalsIgnoreCase("Março") && dia >= 21) ||
        (mes.equalsIgnoreCase("Abril") && dia <= 19)) {

        signo.setText("Áries");
        imagem = (ImageIcon) imgSignoAries.getIcon();
        
        
    // Touro
    } else if ((mes.equalsIgnoreCase("Abril") && dia >= 20) ||
               (mes.equalsIgnoreCase("Maio") && dia <= 20)) {

        signo.setText("Touro");
        imagem = (ImageIcon) imgSignoTouro.getIcon();

    // Gêmeos
    } else if ((mes.equalsIgnoreCase("Maio") && dia >= 21) ||
               (mes.equalsIgnoreCase("Junho") && dia <= 20)) {

        signo.setText("Gêmeos");
        imagem = (ImageIcon) imgSignoGemeos.getIcon();

    // Câncer
    } else if ((mes.equalsIgnoreCase("Junho") && dia >= 21) ||
               (mes.equalsIgnoreCase("Julho") && dia <= 22)) {

        signo.setText("Câncer");
        imagem = (ImageIcon) imgSignoCancer.getIcon();

    // Leão
    } else if ((mes.equalsIgnoreCase("Julho") && dia >= 23) ||
               (mes.equalsIgnoreCase("Agosto") && dia <= 22)) {

        signo.setText("Leão");
        imagem = (ImageIcon) imgSignoLeao.getIcon();

    // Virgem
    } else if ((mes.equalsIgnoreCase("Agosto") && dia >= 23) ||
               (mes.equalsIgnoreCase("Setembro") && dia <= 22)) {

        signo.setText("Virgem");
        imagem = (ImageIcon) imgSignoVirgem.getIcon();

    // Libra
    } else if ((mes.equalsIgnoreCase("Setembro") && dia >= 23) ||
               (mes.equalsIgnoreCase("Outubro") && dia <= 22)) {

        signo.setText("Libra");
        imagem = (ImageIcon) imgSignoLibra.getIcon();

    // Escorpião
    } else if ((mes.equalsIgnoreCase("Outubro") && dia >= 23) ||
               (mes.equalsIgnoreCase("Novembro") && dia <= 21)) {

        signo.setText("Escorpião");
        imagem = (ImageIcon) imgSignoEscorpiao.getIcon();

    // Sagitário
    } else if ((mes.equalsIgnoreCase("Novembro") && dia >= 22) ||
               (mes.equalsIgnoreCase("Dezembro") && dia <= 21)) {

        signo.setText("Sagitário");
        imagem = (ImageIcon) imgSignoSagitario.getIcon();

    // Capricórnio
    } else if ((mes.equalsIgnoreCase("Dezembro") && dia >= 22) ||
               (mes.equalsIgnoreCase("Janeiro") && dia <= 19)) {

        signo.setText("Capricórnio");
        imagem = (ImageIcon) imgSignoCapricornio.getIcon();

    // Aquário
    } else if ((mes.equalsIgnoreCase("Janeiro") && dia >= 20) ||
               (mes.equalsIgnoreCase("Fevereiro") && dia <= 18)) {

        signo.setText("Aquário");
        imagem = (ImageIcon) imgSignoAquario.getIcon();

    // Peixes
    } else if ((mes.equalsIgnoreCase("Fevereiro") && dia >= 19) ||
               (mes.equalsIgnoreCase("Março") && dia <= 20)) {

        signo.setText("Peixes");
        imagem = (ImageIcon) imgSignoPeixes.getIcon();

    } else {
        signo.setText("Data inválida");
        imagem = null;
    }

    Image imgRedimensionada = imagem.getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH);
    
    imgSigno.setIcon(new ImageIcon(imgRedimensionada));
}
    
    public void CalculeComapatibilidade(){
     String signo1 = cbSigno1.getSelectedItem().toString();
     String signo2 = cbSigno2.getSelectedItem().toString();
     
     if( signo1.equalsIgnoreCase("áries")&&
             signo2.equalsIgnoreCase("Touro")){
     tfCompatibilidade.setText("70% compatibilidade!");
     }else if(signo1.equalsIgnoreCase("áries")&&
             signo2.equalsIgnoreCase("Gêmeos")){
         tfCompatibilidade.setText("50% compatibilidade!");
         
     
}
}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaAbas = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        areaDescobrirSigno = new javax.swing.JPanel();
        tituloDescobrirSigno = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        diaNascimento = new javax.swing.JLabel();
        mesNascimento = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        btnDescobrirSigno = new javax.swing.JButton();
        areaCompatibilidade = new javax.swing.JPanel();
        tituloCompatibilidade = new javax.swing.JLabel();
        signo1 = new javax.swing.JLabel();
        signo2 = new javax.swing.JLabel();
        cbSigno2 = new javax.swing.JComboBox<>();
        cbSigno1 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        areaResultado = new javax.swing.JPanel();
        signo = new javax.swing.JLabel();
        compatibilidade = new javax.swing.JLabel();
        imgSigno = new javax.swing.JButton();
        tfCompatibilidade = new javax.swing.JTextField();
        fundoInicio = new javax.swing.JLabel();
        touro = new javax.swing.JPanel();
        areaCaracteristicas1 = new javax.swing.JPanel();
        tituloCaracteristicaTouro = new javax.swing.JLabel();
        pfortesTouro = new javax.swing.JLabel();
        pMelhorarTouro = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txFortesTouro = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txMelhorarTouro = new javax.swing.JTextArea();
        areaInformacoes1 = new javax.swing.JPanel();
        imgSignoTouro = new javax.swing.JLabel();
        tituloTouro = new javax.swing.JLabel();
        periodoTouro = new javax.swing.JLabel();
        elementoTouro = new javax.swing.JLabel();
        planetaTouro = new javax.swing.JLabel();
        corTouro = new javax.swing.JLabel();
        numeroTouro = new javax.swing.JLabel();
        tfPeriodoTouro = new javax.swing.JTextField();
        tfElementoTouro = new javax.swing.JTextField();
        tfPlanetaTouro = new javax.swing.JTextField();
        tfCorTouro = new javax.swing.JTextField();
        tfNumeroTouro = new javax.swing.JTextField();
        areaPrevisao1 = new javax.swing.JPanel();
        previsaoTouro = new javax.swing.JLabel();
        txPrevisaoTouro = new javax.swing.JScrollPane();
        txtPrevisaoTouro = new javax.swing.JTextArea();
        btnAtualizarPrevisaoTouro = new javax.swing.JButton();
        areaEnergia1 = new javax.swing.JPanel();
        tituloEnergiaTouro = new javax.swing.JLabel();
        trabalhoTouro = new javax.swing.JLabel();
        sorteTouro = new javax.swing.JLabel();
        amorTouro = new javax.swing.JLabel();
        saudeTouro = new javax.swing.JLabel();
        tfAmorAries1 = new javax.swing.JTextField();
        tfTrabalhoAries1 = new javax.swing.JTextField();
        tfSaudeAries1 = new javax.swing.JTextField();
        tfSorteAries1 = new javax.swing.JTextField();
        areaMensagem1 = new javax.swing.JPanel();
        tituloMensagemTouro = new javax.swing.JLabel();
        txMensagemTouro = new javax.swing.JScrollPane();
        txtMensagemTouro = new javax.swing.JTextArea();
        btnCopiarMsgTouro = new javax.swing.JButton();
        fundoTouro = new javax.swing.JLabel();
        leao = new javax.swing.JPanel();
        areaCaracteristicas4 = new javax.swing.JPanel();
        tituloCaracteristicaLeao = new javax.swing.JLabel();
        pfortesLeao = new javax.swing.JLabel();
        pMelhorarLeao = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txFortesLeao = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txMelhorarLeao = new javax.swing.JTextArea();
        areaInformacoes4 = new javax.swing.JPanel();
        imgSignoLeao = new javax.swing.JLabel();
        tituloLeao = new javax.swing.JLabel();
        periodoLeao = new javax.swing.JLabel();
        elementoLeao = new javax.swing.JLabel();
        planetaLeao = new javax.swing.JLabel();
        corLeao = new javax.swing.JLabel();
        numeroLeao = new javax.swing.JLabel();
        tfPeriodoLeao = new javax.swing.JTextField();
        tfElementoLeao = new javax.swing.JTextField();
        tfPlanetaLeao = new javax.swing.JTextField();
        tfCorLeao = new javax.swing.JTextField();
        tfNumeroLeao = new javax.swing.JTextField();
        areaPrevisao4 = new javax.swing.JPanel();
        previsaoLeao = new javax.swing.JLabel();
        txPrevisaoAries4 = new javax.swing.JScrollPane();
        txtPrevisaoLeao = new javax.swing.JTextArea();
        btnAtualizarPrevisaoLeao = new javax.swing.JButton();
        areaEnergia4 = new javax.swing.JPanel();
        tituloEnergiaLeao = new javax.swing.JLabel();
        trabalhoLeao = new javax.swing.JLabel();
        sorteLeao = new javax.swing.JLabel();
        amorLeao = new javax.swing.JLabel();
        saudeLeao = new javax.swing.JLabel();
        tfAmorLeao = new javax.swing.JTextField();
        tfTrabalhoLeao = new javax.swing.JTextField();
        tfSaudeLeao = new javax.swing.JTextField();
        tfSorteLeao = new javax.swing.JTextField();
        areaMensagemLeao = new javax.swing.JPanel();
        tituloMensagemLeao = new javax.swing.JLabel();
        txMensagemAries4 = new javax.swing.JScrollPane();
        txtMensagemLeao = new javax.swing.JTextArea();
        btnCopiarMsgLeao = new javax.swing.JButton();
        fundoLeao = new javax.swing.JLabel();
        virgem = new javax.swing.JPanel();
        areaCaracteristicas5 = new javax.swing.JPanel();
        tituloCaracteristicaVirgem = new javax.swing.JLabel();
        pfortesVirgem = new javax.swing.JLabel();
        pMelhorarVirgem = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txFortesVirgem = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txMelhorarVirgem = new javax.swing.JTextArea();
        areaInformacoes5 = new javax.swing.JPanel();
        imgSignoVirgem = new javax.swing.JLabel();
        tituloVirgem = new javax.swing.JLabel();
        periodoVirgem = new javax.swing.JLabel();
        elementoVirgem = new javax.swing.JLabel();
        planetaVirgem = new javax.swing.JLabel();
        corVirgem = new javax.swing.JLabel();
        numeroVirgem = new javax.swing.JLabel();
        tfPeriodoVirgem = new javax.swing.JTextField();
        tfElementoVirgem = new javax.swing.JTextField();
        tfPlanetaVirgem = new javax.swing.JTextField();
        tfCorVirgem = new javax.swing.JTextField();
        tfNumeroVirgem = new javax.swing.JTextField();
        areaPrevisao5 = new javax.swing.JPanel();
        previsaoVirgem = new javax.swing.JLabel();
        txPrevisaoVirgem = new javax.swing.JScrollPane();
        txtPrevisaoVirgem = new javax.swing.JTextArea();
        btnAtualizarPrevisaoVirgem = new javax.swing.JButton();
        areaEnergia5 = new javax.swing.JPanel();
        tituloEnergiaVirgem = new javax.swing.JLabel();
        trabalhoVirgem = new javax.swing.JLabel();
        sorteVirgem = new javax.swing.JLabel();
        amorVirgem = new javax.swing.JLabel();
        saudeVirgem = new javax.swing.JLabel();
        tfAmorVirgem = new javax.swing.JTextField();
        tfTrabalhoVirgem = new javax.swing.JTextField();
        tfSaudeVirgem = new javax.swing.JTextField();
        tfSorteVirgem = new javax.swing.JTextField();
        areaMensagem5 = new javax.swing.JPanel();
        tituloMensagemVirgem = new javax.swing.JLabel();
        txMensagemVirgem = new javax.swing.JScrollPane();
        txtMensagemVirgem = new javax.swing.JTextArea();
        btnCopiarMsgVirgem = new javax.swing.JButton();
        fundoVirgem = new javax.swing.JLabel();
        libra = new javax.swing.JPanel();
        areaCaracteristicas6 = new javax.swing.JPanel();
        tituloCaracteristicaLibra = new javax.swing.JLabel();
        pfortesLibra = new javax.swing.JLabel();
        pMelhorarLibra = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txFortesLibra = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txMelhorarLibra = new javax.swing.JTextArea();
        areaInformacoesLibra = new javax.swing.JPanel();
        imgSignoLibra = new javax.swing.JLabel();
        tituloLibra = new javax.swing.JLabel();
        periodoLibra = new javax.swing.JLabel();
        elementoLibra = new javax.swing.JLabel();
        planetaLibra = new javax.swing.JLabel();
        corLibra = new javax.swing.JLabel();
        numeroLibra = new javax.swing.JLabel();
        tfPeriodoLibra = new javax.swing.JTextField();
        tfElementoLibra = new javax.swing.JTextField();
        tfPlanetaLibra = new javax.swing.JTextField();
        tfCorLibra = new javax.swing.JTextField();
        tfNumeroLibra = new javax.swing.JTextField();
        areaPrevisaoLibra = new javax.swing.JPanel();
        previsaoLibra = new javax.swing.JLabel();
        txPrevisaoLibra = new javax.swing.JScrollPane();
        txtPrevisaoLibra = new javax.swing.JTextArea();
        btnAtualizarPrevisaoLibra = new javax.swing.JButton();
        areaEnergiaLibra = new javax.swing.JPanel();
        tituloEnergiaLibra = new javax.swing.JLabel();
        trabalhoLibra = new javax.swing.JLabel();
        sorteLibra = new javax.swing.JLabel();
        amorLibra = new javax.swing.JLabel();
        saudeLibra = new javax.swing.JLabel();
        tfAmorLibra = new javax.swing.JTextField();
        tfTrabalhoLibra = new javax.swing.JTextField();
        tfSaudeLibra = new javax.swing.JTextField();
        tfSorteLibra = new javax.swing.JTextField();
        areaMensagemLibra = new javax.swing.JPanel();
        tituloMensagemLibra = new javax.swing.JLabel();
        txMensagemLibra = new javax.swing.JScrollPane();
        txtMensagemLibra = new javax.swing.JTextArea();
        btnCopiarMsgLibra = new javax.swing.JButton();
        fundoLibra = new javax.swing.JLabel();
        sagitario = new javax.swing.JPanel();
        areaCaracteristicasSagitario = new javax.swing.JPanel();
        tituloCaracteristicaSagitario = new javax.swing.JLabel();
        pfortesSagitario = new javax.swing.JLabel();
        pMelhorarSagitario = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txFortesSagitario = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        txMelhorarSagitario = new javax.swing.JTextArea();
        areaInformacoesSagitario = new javax.swing.JPanel();
        imgSignoSagitario = new javax.swing.JLabel();
        tituloAriesSagitario = new javax.swing.JLabel();
        periodoAriesSagitario = new javax.swing.JLabel();
        elementoSagitario = new javax.swing.JLabel();
        planetaSagitario = new javax.swing.JLabel();
        corSagitario = new javax.swing.JLabel();
        numeroSagitario = new javax.swing.JLabel();
        tfPeriodoSagitario = new javax.swing.JTextField();
        tfElementoSagitario = new javax.swing.JTextField();
        tfPlanetaSagitario = new javax.swing.JTextField();
        tfCorSagitario = new javax.swing.JTextField();
        tfNumeroSagitario = new javax.swing.JTextField();
        areaPrevisaoSagitario = new javax.swing.JPanel();
        previsaoSagitario = new javax.swing.JLabel();
        txPrevisaoAries8 = new javax.swing.JScrollPane();
        txtPrevisaoSagitario = new javax.swing.JTextArea();
        btnAtualizarPrevisaoSagitario = new javax.swing.JButton();
        areaEnergiaSagitario = new javax.swing.JPanel();
        tituloEnergiaSagitario = new javax.swing.JLabel();
        trabalhoSagitario = new javax.swing.JLabel();
        sorteSagitario = new javax.swing.JLabel();
        amorSagitario = new javax.swing.JLabel();
        saudeSagitario = new javax.swing.JLabel();
        tfAmorSagitario = new javax.swing.JTextField();
        tfTrabalhoSagitario = new javax.swing.JTextField();
        tfSaudeSagitario = new javax.swing.JTextField();
        tfSorteSagitario = new javax.swing.JTextField();
        areaMensagemSagitario = new javax.swing.JPanel();
        tituloMensagemSagitario = new javax.swing.JLabel();
        txMensagemAries8 = new javax.swing.JScrollPane();
        txtMensagemSagitario = new javax.swing.JTextArea();
        btnCopiarMsgSagitario = new javax.swing.JButton();
        fundoSagitario = new javax.swing.JLabel();
        capricornio = new javax.swing.JPanel();
        areaCaracteristicasCapricornio = new javax.swing.JPanel();
        tituloCaracteristicaCapricornio = new javax.swing.JLabel();
        pfortesCapricornio = new javax.swing.JLabel();
        pMelhorarCapricornio = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txFortesCapricornio = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        txMelhorarCapricornio = new javax.swing.JTextArea();
        areaInformacoesCapricornio = new javax.swing.JPanel();
        imgSignoCapricornio = new javax.swing.JLabel();
        tituloAriesCapricornio = new javax.swing.JLabel();
        periodoAriesCapricornio = new javax.swing.JLabel();
        elementoAriesCapricornio = new javax.swing.JLabel();
        planetaAriesCapricornio = new javax.swing.JLabel();
        corAriesCapricornio = new javax.swing.JLabel();
        numeroAriesCapricornio = new javax.swing.JLabel();
        tfPeriodoAriesCapricornio = new javax.swing.JTextField();
        tfElementoAriesCapricornio = new javax.swing.JTextField();
        tfPlanetaAriesCapricornio = new javax.swing.JTextField();
        tfCorAriesCapricornio = new javax.swing.JTextField();
        tfNumeroAriesCapricornio = new javax.swing.JTextField();
        areaPrevisaoCapricornio = new javax.swing.JPanel();
        previsaoCapricornio = new javax.swing.JLabel();
        txPrevisaoAries9 = new javax.swing.JScrollPane();
        txtPrevisaoCapricornio = new javax.swing.JTextArea();
        btnAtualizarPrevisaoCapricornio = new javax.swing.JButton();
        areaCapricornio = new javax.swing.JPanel();
        tituloEnergiaAries9 = new javax.swing.JLabel();
        trabalhoAries9 = new javax.swing.JLabel();
        sorteAries9 = new javax.swing.JLabel();
        amorAries9 = new javax.swing.JLabel();
        saudeAries9 = new javax.swing.JLabel();
        tfAmorAries9 = new javax.swing.JTextField();
        tfTrabalhoAries9 = new javax.swing.JTextField();
        tfSaudeAries9 = new javax.swing.JTextField();
        tfSorteAries9 = new javax.swing.JTextField();
        areaMensagemCapricornio = new javax.swing.JPanel();
        tituloMensagemCapricornio = new javax.swing.JLabel();
        txMensagemAries9 = new javax.swing.JScrollPane();
        txtMensagemCapricornio = new javax.swing.JTextArea();
        btnCopiarMsgCapricornio = new javax.swing.JButton();
        fundoCapricornio = new javax.swing.JLabel();
        aquario = new javax.swing.JPanel();
        areaCaracteristicasAquario = new javax.swing.JPanel();
        tituloCaracteristicaAquario = new javax.swing.JLabel();
        pfortesAquario = new javax.swing.JLabel();
        pMelhorarAquario = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txFortesAquario = new javax.swing.JTextArea();
        jScrollPane22 = new javax.swing.JScrollPane();
        txMelhorarAquario = new javax.swing.JTextArea();
        areaInformacoesAquario = new javax.swing.JPanel();
        imgSignoAquario = new javax.swing.JLabel();
        tituloAquario = new javax.swing.JLabel();
        periodoAquario = new javax.swing.JLabel();
        elementoAquario = new javax.swing.JLabel();
        planetaAquario = new javax.swing.JLabel();
        corAquario = new javax.swing.JLabel();
        numeroAquario = new javax.swing.JLabel();
        tfPeriodoAquario = new javax.swing.JTextField();
        tfElementoAquario = new javax.swing.JTextField();
        tfPlanetaAquario = new javax.swing.JTextField();
        tfCorAquario = new javax.swing.JTextField();
        tfNumeroAquario = new javax.swing.JTextField();
        areaPrevisaoAquario = new javax.swing.JPanel();
        previsaoAquario = new javax.swing.JLabel();
        txPrevisaoAries10 = new javax.swing.JScrollPane();
        txtPrevisaoAquario = new javax.swing.JTextArea();
        btnAtualizarPrevisaoAquario = new javax.swing.JButton();
        areaEnergiaAquario = new javax.swing.JPanel();
        tituloEnergiaAquario = new javax.swing.JLabel();
        trabalhoAquario = new javax.swing.JLabel();
        sorteAquario = new javax.swing.JLabel();
        amorAquario = new javax.swing.JLabel();
        saudeAquario = new javax.swing.JLabel();
        tfAmorAquario = new javax.swing.JTextField();
        tfTrabalhoAquario = new javax.swing.JTextField();
        tfSaudeAquario = new javax.swing.JTextField();
        tfSorteAquario = new javax.swing.JTextField();
        areaMensagemAquario = new javax.swing.JPanel();
        tituloMensagemAquario = new javax.swing.JLabel();
        txMensagemAries10 = new javax.swing.JScrollPane();
        txtMensagemAquario = new javax.swing.JTextArea();
        btnCopiarMsgAquario = new javax.swing.JButton();
        fundoAquario = new javax.swing.JLabel();
        peixes = new javax.swing.JPanel();
        areaCaracteristicas11 = new javax.swing.JPanel();
        tituloCaracteristicaAries11 = new javax.swing.JLabel();
        pfortesAries11 = new javax.swing.JLabel();
        pMelhorarAries11 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txFortesAries11 = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        txMelhorarAries11 = new javax.swing.JTextArea();
        areaInformacoes11 = new javax.swing.JPanel();
        imgSignoPeixes = new javax.swing.JLabel();
        tituloAries11 = new javax.swing.JLabel();
        periodoAries11 = new javax.swing.JLabel();
        elementoAries11 = new javax.swing.JLabel();
        planetaAries11 = new javax.swing.JLabel();
        corAries11 = new javax.swing.JLabel();
        numeroAries11 = new javax.swing.JLabel();
        tfPeriodoAries11 = new javax.swing.JTextField();
        tfElementoAries11 = new javax.swing.JTextField();
        tfPlanetaAries11 = new javax.swing.JTextField();
        tfCorAries11 = new javax.swing.JTextField();
        tfNumeroAries11 = new javax.swing.JTextField();
        areaPrevisao11 = new javax.swing.JPanel();
        previsaoPeixes = new javax.swing.JLabel();
        txPrevisaoPeixes = new javax.swing.JScrollPane();
        txtPrevisaoPeixes = new javax.swing.JTextArea();
        btnAtualizarPrevisaoPeixes = new javax.swing.JButton();
        areaEnergia11 = new javax.swing.JPanel();
        tituloEnergiaPeixes = new javax.swing.JLabel();
        trabalhoPeixes = new javax.swing.JLabel();
        sortePeixes = new javax.swing.JLabel();
        amorPeixes = new javax.swing.JLabel();
        saudePeixes = new javax.swing.JLabel();
        tfAmorPeixes = new javax.swing.JTextField();
        tfTrabalhoPeixes = new javax.swing.JTextField();
        tfSaudePeixes = new javax.swing.JTextField();
        tfSortePeixes = new javax.swing.JTextField();
        areaMensagem11 = new javax.swing.JPanel();
        tituloMensagemPeixes = new javax.swing.JLabel();
        txMensagemPeixes = new javax.swing.JScrollPane();
        txtMensagemPeixes = new javax.swing.JTextArea();
        btnCopiarMsgPeixes = new javax.swing.JButton();
        fundoPeixes = new javax.swing.JLabel();
        aries = new javax.swing.JPanel();
        areaCaracteristicas = new javax.swing.JPanel();
        tituloCaracteristicaAries = new javax.swing.JLabel();
        pfortesAries = new javax.swing.JLabel();
        pMelhorarAries = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txFortesAries = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txMelhorarAries = new javax.swing.JTextArea();
        areaInformacoes = new javax.swing.JPanel();
        imgSignoAries = new javax.swing.JLabel();
        periodoAries = new javax.swing.JLabel();
        elementoAries = new javax.swing.JLabel();
        planetaAries = new javax.swing.JLabel();
        corAries = new javax.swing.JLabel();
        numeroAries = new javax.swing.JLabel();
        tfPeriodoAries = new javax.swing.JTextField();
        tfElementoAries = new javax.swing.JTextField();
        tfPlanetaAries = new javax.swing.JTextField();
        tfCorAries = new javax.swing.JTextField();
        tfNumeroAries = new javax.swing.JTextField();
        tituloAries = new javax.swing.JLabel();
        areaPrevisao = new javax.swing.JPanel();
        previsaoAries = new javax.swing.JLabel();
        txPrevisaoAries = new javax.swing.JScrollPane();
        txtPrevisaoAries = new javax.swing.JTextArea();
        btnAtualizarPrevisaoAries = new javax.swing.JButton();
        areaEnergia = new javax.swing.JPanel();
        tituloEnergiaAries = new javax.swing.JLabel();
        trabalhoAries = new javax.swing.JLabel();
        sorteAries = new javax.swing.JLabel();
        amorAries = new javax.swing.JLabel();
        saudeAries = new javax.swing.JLabel();
        tfAmorAries = new javax.swing.JTextField();
        tfTrabalhoAries = new javax.swing.JTextField();
        tfSaudeAries = new javax.swing.JTextField();
        tfSorteAries = new javax.swing.JTextField();
        areaMensagem = new javax.swing.JPanel();
        tituloMensagemAries = new javax.swing.JLabel();
        txMensagemAries = new javax.swing.JScrollPane();
        txtMensagemAries = new javax.swing.JTextArea();
        btnCopiarMsgAries = new javax.swing.JButton();
        fundoAries = new javax.swing.JLabel();
        cancer = new javax.swing.JPanel();
        areaCaracteristicas3 = new javax.swing.JPanel();
        tituloCaracteristicaCancer = new javax.swing.JLabel();
        pfortesCancer = new javax.swing.JLabel();
        pMelhorarCancer = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txFortesCancer = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txMelhorarCancer = new javax.swing.JTextArea();
        areaInformacoes3 = new javax.swing.JPanel();
        imgSignoCancer = new javax.swing.JLabel();
        tituloCancer = new javax.swing.JLabel();
        periodoCancer = new javax.swing.JLabel();
        elementoCancer = new javax.swing.JLabel();
        planetaCancer = new javax.swing.JLabel();
        corCancer = new javax.swing.JLabel();
        numeroCancer = new javax.swing.JLabel();
        tfPeriodoCancer = new javax.swing.JTextField();
        tfElementoCancer = new javax.swing.JTextField();
        tfPlanetaCancer = new javax.swing.JTextField();
        tfCorCancer = new javax.swing.JTextField();
        tfNumeroCancer = new javax.swing.JTextField();
        areaPrevisao3 = new javax.swing.JPanel();
        previsaoCancer = new javax.swing.JLabel();
        txPrevisaoCancer = new javax.swing.JScrollPane();
        txtPrevisaoCancer = new javax.swing.JTextArea();
        btnAtualizarPrevisaoCancer = new javax.swing.JButton();
        areaEnergia3 = new javax.swing.JPanel();
        tituloEnergiaCancer = new javax.swing.JLabel();
        trabalhoCancer = new javax.swing.JLabel();
        sorteCancer = new javax.swing.JLabel();
        amorCancer = new javax.swing.JLabel();
        saudeCancer = new javax.swing.JLabel();
        tfAmorCancer = new javax.swing.JTextField();
        tfTrabalhoCancer = new javax.swing.JTextField();
        tfSaudeCancer = new javax.swing.JTextField();
        tfSorteCancer = new javax.swing.JTextField();
        areaMensagem3 = new javax.swing.JPanel();
        tituloMensagemCancer = new javax.swing.JLabel();
        txMensagemCancer = new javax.swing.JScrollPane();
        txtMensagemCancer = new javax.swing.JTextArea();
        btnCopiarMsgCancer = new javax.swing.JButton();
        fundoCancer = new javax.swing.JLabel();
        escorpiao = new javax.swing.JPanel();
        areaCaracteristicasEscorpiao = new javax.swing.JPanel();
        tituloCaracteristicaEscorpiao = new javax.swing.JLabel();
        pfortesEscorpiao = new javax.swing.JLabel();
        pMelhorarEscorpiao = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txFortesEscorpiao = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        txMelhorarEscorpiao = new javax.swing.JTextArea();
        areaInformacoesEscorpiao = new javax.swing.JPanel();
        imgSignoEscorpiao = new javax.swing.JLabel();
        tituloEscorpiao = new javax.swing.JLabel();
        periodoEscorpiao = new javax.swing.JLabel();
        elementoEscorpiao = new javax.swing.JLabel();
        planetaEscorpiao = new javax.swing.JLabel();
        corEscorpiao = new javax.swing.JLabel();
        numeroEscorpiao = new javax.swing.JLabel();
        tfPeriodoEscorpiao = new javax.swing.JTextField();
        tfElementoEscorpiao = new javax.swing.JTextField();
        tfPlanetaEscorpiao = new javax.swing.JTextField();
        tfCorEscorpiao = new javax.swing.JTextField();
        tfNumeroEscorpiao = new javax.swing.JTextField();
        areaPrevisaoEscorpiao = new javax.swing.JPanel();
        previsaoEscorpiao = new javax.swing.JLabel();
        txPrevisaoEscorpiao = new javax.swing.JScrollPane();
        txtPrevisaoEscorpiao = new javax.swing.JTextArea();
        btnAtualizarPrevisaoEscorpiao = new javax.swing.JButton();
        areaEnergiaEscorpiao = new javax.swing.JPanel();
        tituloEnergiaEscorpiao = new javax.swing.JLabel();
        trabalhoEscorpiao = new javax.swing.JLabel();
        sorteEscorpiao = new javax.swing.JLabel();
        amorEscorpiao = new javax.swing.JLabel();
        saudeEscorpiao = new javax.swing.JLabel();
        tfAmorEscorpiao = new javax.swing.JTextField();
        tfTrabalhoEscorpiao = new javax.swing.JTextField();
        tfSaudeEscorpiao = new javax.swing.JTextField();
        tfSorteEscorpiao = new javax.swing.JTextField();
        areaMensagemEscorpiao = new javax.swing.JPanel();
        tituloMensagemEscorpiao = new javax.swing.JLabel();
        txMensagemEscorpiao = new javax.swing.JScrollPane();
        txtMensagemEscorpiao = new javax.swing.JTextArea();
        btnCopiarMsgEscorpiao = new javax.swing.JButton();
        fundoEscorpiao = new javax.swing.JLabel();
        fundoGemeos = new javax.swing.JLabel();
        gemeos = new javax.swing.JPanel();
        areaCaracteristicas2 = new javax.swing.JPanel();
        tituloCaracteristicaGemeos = new javax.swing.JLabel();
        pfortesGemeos = new javax.swing.JLabel();
        pMelhorarGemeos = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txFortesGemeos = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txMelhorarGemeos = new javax.swing.JTextArea();
        areaInformacoes2 = new javax.swing.JPanel();
        imgSignoGemeos = new javax.swing.JLabel();
        tituloGemeos = new javax.swing.JLabel();
        periodoGemeos = new javax.swing.JLabel();
        elementoGemeos = new javax.swing.JLabel();
        planetaGemeos = new javax.swing.JLabel();
        corGemeos = new javax.swing.JLabel();
        numeroGemeos = new javax.swing.JLabel();
        tfPeriodoAries2 = new javax.swing.JTextField();
        tfElementoAries2 = new javax.swing.JTextField();
        tfPlanetaAries2 = new javax.swing.JTextField();
        tfCorAries2 = new javax.swing.JTextField();
        tfNumeroAries2 = new javax.swing.JTextField();
        areaPrevisao2 = new javax.swing.JPanel();
        previsaoGemeos = new javax.swing.JLabel();
        txPrevisaoAries2 = new javax.swing.JScrollPane();
        txtPrevisaoGemeos = new javax.swing.JTextArea();
        btnAtualizarPrevisaoGemeos = new javax.swing.JButton();
        areaEnergia2 = new javax.swing.JPanel();
        tituloEnergiaGemeos = new javax.swing.JLabel();
        trabalhoGemeos = new javax.swing.JLabel();
        sorteGemeos = new javax.swing.JLabel();
        amorGemeos = new javax.swing.JLabel();
        saudeGemeos = new javax.swing.JLabel();
        tfAmorGemeos = new javax.swing.JTextField();
        tfTrabalhoGemeos = new javax.swing.JTextField();
        tfSaudeGemeos = new javax.swing.JTextField();
        tfSorteGemeos = new javax.swing.JTextField();
        areaMensagem2 = new javax.swing.JPanel();
        tituloMensagemGemeos = new javax.swing.JLabel();
        txMensagemGemeos = new javax.swing.JScrollPane();
        txtMensagemGemeos = new javax.swing.JTextArea();
        btnCopiarMsgGemeos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaAbas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloDescobrirSigno.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloDescobrirSigno.setText("Descubra Seu Signo");

        nome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nome.setText("Nome:");

        diaNascimento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        diaNascimento.setText("Dia de Nascimento:");

        mesNascimento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mesNascimento.setText("Mês de Nascimento:");

        tfNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfNome.setText("digite seu nome");

        cbDia.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbMes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        btnDescobrirSigno.setBackground(new java.awt.Color(0, 0, 255));
        btnDescobrirSigno.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnDescobrirSigno.setForeground(new java.awt.Color(255, 255, 255));
        btnDescobrirSigno.setText("Descobrir Signo");

        javax.swing.GroupLayout areaDescobrirSignoLayout = new javax.swing.GroupLayout(areaDescobrirSigno);
        areaDescobrirSigno.setLayout(areaDescobrirSignoLayout);
        areaDescobrirSignoLayout.setHorizontalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diaNascimento)
                                    .addComponent(mesNascimento))
                                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(tituloDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        areaDescobrirSignoLayout.setVerticalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(tituloDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaNascimento))
                .addGap(28, 28, 28)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesNascimento)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDescobrirSigno)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        inicio.add(areaDescobrirSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 670, 430));

        tituloCompatibilidade.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloCompatibilidade.setText("Compatibilidade");

        signo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signo1.setText("Primeiro Signo:");

        signo2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signo2.setText("Segundo Signo:");

        cbSigno2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbSigno2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        cbSigno1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbSigno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        btnCalcular.setBackground(new java.awt.Color(51, 51, 255));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");

        javax.swing.GroupLayout areaCompatibilidadeLayout = new javax.swing.GroupLayout(areaCompatibilidade);
        areaCompatibilidade.setLayout(areaCompatibilidadeLayout);
        areaCompatibilidadeLayout.setHorizontalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signo1)
                            .addComponent(signo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        areaCompatibilidadeLayout.setVerticalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo1)
                    .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo2)
                    .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        inicio.add(areaCompatibilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 670, 380));

        signo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        signo.setText("Signo");

        compatibilidade.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        compatibilidade.setText("Compatibilidade");

        imgSigno.setBackground(new java.awt.Color(0, 0, 102));

        tfCompatibilidade.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout areaResultadoLayout = new javax.swing.GroupLayout(areaResultado);
        areaResultado.setLayout(areaResultadoLayout);
        areaResultadoLayout.setHorizontalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(signo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaResultadoLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaResultadoLayout.createSequentialGroup()
                        .addComponent(imgSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaResultadoLayout.createSequentialGroup()
                        .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(compatibilidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfCompatibilidade))
                        .addGap(62, 62, 62))))
        );
        areaResultadoLayout.setVerticalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(signo)
                .addGap(26, 26, 26)
                .addComponent(imgSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(compatibilidade)
                .addGap(45, 45, 45)
                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        inicio.add(areaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, 410, 890));

        fundoInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\PedroLeite\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\Assets\\fundo.jpg!d")); // NOI18N
        inicio.add(fundoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1810, 1090));

        areaAbas.addTab("Inicio", inicio);

        touro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaTouro.setText("Características");

        pfortesTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesTouro.setText("Pontos Fortes:");

        pMelhorarTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarTouro.setText("Pontos a Melhorar:");

        txFortesTouro.setColumns(20);
        txFortesTouro.setRows(5);
        jScrollPane3.setViewportView(txFortesTouro);

        txMelhorarTouro.setColumns(20);
        txMelhorarTouro.setRows(5);
        jScrollPane4.setViewportView(txMelhorarTouro);

        javax.swing.GroupLayout areaCaracteristicas1Layout = new javax.swing.GroupLayout(areaCaracteristicas1);
        areaCaracteristicas1.setLayout(areaCaracteristicas1Layout);
        areaCaracteristicas1Layout.setHorizontalGroup(
            areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(pMelhorarTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas1Layout.setVerticalGroup(
            areaCaracteristicas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4)
                .addGap(27, 27, 27))
        );

        touro.add(areaCaracteristicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        tituloTouro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloTouro.setText("Touro");

        periodoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoTouro.setText("PERIODO:");

        elementoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoTouro.setText("ELEMENTO:");

        planetaTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaTouro.setText("PLANETA REGENTE:");

        corTouro.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corTouro.setText("COR:");

        numeroTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroTouro.setText("NÚMERO DA SORTE:");

        javax.swing.GroupLayout areaInformacoes1Layout = new javax.swing.GroupLayout(areaInformacoes1);
        areaInformacoes1.setLayout(areaInformacoes1Layout);
        areaInformacoes1Layout.setHorizontalGroup(
            areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes1Layout.createSequentialGroup()
                            .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaTouro)
                                .addComponent(tfNumeroTouro)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes1Layout.createSequentialGroup()
                            .addComponent(elementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoTouro))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes1Layout.createSequentialGroup()
                            .addComponent(periodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes1Layout.createSequentialGroup()
                            .addComponent(corTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorTouro))))
                .addGap(10, 10, 10))
        );
        areaInformacoes1Layout.setVerticalGroup(
            areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoTouro)
                    .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoTouro)
                    .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro)
                    .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro)
                    .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTouro)
                    .addComponent(tfNumeroTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        touro.add(areaInformacoes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoTouro.setText("Previsão do Dia:");

        txtPrevisaoTouro.setColumns(20);
        txtPrevisaoTouro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtPrevisaoTouro.setRows(5);
        txPrevisaoTouro.setViewportView(txtPrevisaoTouro);

        btnAtualizarPrevisaoTouro.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoTouro.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao1Layout = new javax.swing.GroupLayout(areaPrevisao1);
        areaPrevisao1.setLayout(areaPrevisao1Layout);
        areaPrevisao1Layout.setHorizontalGroup(
            areaPrevisao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoTouro)
                    .addGroup(areaPrevisao1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao1Layout.setVerticalGroup(
            areaPrevisao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        touro.add(areaPrevisao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaTouro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaTouro.setText("Energia do Dia");

        trabalhoTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoTouro.setText("Trabalho:");

        sorteTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteTouro.setText("Sorte:");

        amorTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorTouro.setText("Amor:");

        saudeTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeTouro.setText("Saúde:");

        javax.swing.GroupLayout areaEnergia1Layout = new javax.swing.GroupLayout(areaEnergia1);
        areaEnergia1.setLayout(areaEnergia1Layout);
        areaEnergia1Layout.setHorizontalGroup(
            areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(amorTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorAries1)
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(trabalhoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoAries1)
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(saudeTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeAries1)
                    .addGroup(areaEnergia1Layout.createSequentialGroup()
                        .addComponent(sorteTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteAries1)
                    .addComponent(tituloEnergiaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia1Layout.setVerticalGroup(
            areaEnergia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries1)
                .addGap(16, 16, 16)
                .addComponent(trabalhoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAries1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAries1)
                .addGap(15, 15, 15)
                .addComponent(sorteTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAries1)
                .addGap(51, 51, 51))
        );

        touro.add(areaEnergia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemTouro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemTouro.setText("Mensagem do dia");

        txtMensagemTouro.setColumns(20);
        txtMensagemTouro.setRows(5);
        txMensagemTouro.setViewportView(txtMensagemTouro);

        btnCopiarMsgTouro.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgTouro.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem1Layout = new javax.swing.GroupLayout(areaMensagem1);
        areaMensagem1.setLayout(areaMensagem1Layout);
        areaMensagem1Layout.setHorizontalGroup(
            areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagem1Layout.setVerticalGroup(
            areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgTouro)
                .addGap(20, 20, 20))
        );

        touro.add(areaMensagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));
        touro.add(fundoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Touro", touro);

        leao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaLeao.setText("Características");

        pfortesLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesLeao.setText("Pontos Fortes:");

        pMelhorarLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarLeao.setText("Pontos a Melhorar:");

        txFortesLeao.setColumns(20);
        txFortesLeao.setRows(5);
        jScrollPane9.setViewportView(txFortesLeao);

        txMelhorarLeao.setColumns(20);
        txMelhorarLeao.setRows(5);
        jScrollPane10.setViewportView(txMelhorarLeao);

        javax.swing.GroupLayout areaCaracteristicas4Layout = new javax.swing.GroupLayout(areaCaracteristicas4);
        areaCaracteristicas4.setLayout(areaCaracteristicas4Layout);
        areaCaracteristicas4Layout.setHorizontalGroup(
            areaCaracteristicas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9)
                    .addComponent(pMelhorarLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas4Layout.setVerticalGroup(
            areaCaracteristicas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10)
                .addGap(27, 27, 27))
        );

        leao.add(areaCaracteristicas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        tituloLeao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLeao.setText("Leão");

        periodoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoLeao.setText("PERIODO:");

        elementoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoLeao.setText("ELEMENTO:");

        planetaLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaLeao.setText("PLANETA REGENTE:");

        corLeao.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corLeao.setText("COR:");

        numeroLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroLeao.setText("NÚMERO DA SORTE:");

        javax.swing.GroupLayout areaInformacoes4Layout = new javax.swing.GroupLayout(areaInformacoes4);
        areaInformacoes4.setLayout(areaInformacoes4Layout);
        areaInformacoes4Layout.setHorizontalGroup(
            areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes4Layout.createSequentialGroup()
                            .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaLeao)
                                .addComponent(tfNumeroLeao)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes4Layout.createSequentialGroup()
                            .addComponent(elementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoLeao))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes4Layout.createSequentialGroup()
                            .addComponent(periodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes4Layout.createSequentialGroup()
                            .addComponent(corLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorLeao))))
                .addGap(10, 10, 10))
        );
        areaInformacoes4Layout.setVerticalGroup(
            areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLeao)
                    .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLeao)
                    .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLeao)
                    .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLeao)
                    .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLeao)
                    .addComponent(tfNumeroLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        leao.add(areaInformacoes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoLeao.setText("Previsão do Dia:");

        txtPrevisaoLeao.setColumns(20);
        txtPrevisaoLeao.setRows(5);
        txPrevisaoAries4.setViewportView(txtPrevisaoLeao);

        btnAtualizarPrevisaoLeao.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoLeao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao4Layout = new javax.swing.GroupLayout(areaPrevisao4);
        areaPrevisao4.setLayout(areaPrevisao4Layout);
        areaPrevisao4Layout.setHorizontalGroup(
            areaPrevisao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries4)
                    .addGroup(areaPrevisao4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao4Layout.setVerticalGroup(
            areaPrevisao4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries4, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        leao.add(areaPrevisao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaLeao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaLeao.setText("Energia do Dia");

        trabalhoLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoLeao.setText("Trabalho:");

        sorteLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteLeao.setText("Sorte:");

        amorLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorLeao.setText("Amor:");

        saudeLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeLeao.setText("Saúde:");

        javax.swing.GroupLayout areaEnergia4Layout = new javax.swing.GroupLayout(areaEnergia4);
        areaEnergia4.setLayout(areaEnergia4Layout);
        areaEnergia4Layout.setHorizontalGroup(
            areaEnergia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(amorLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorLeao)
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(trabalhoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoLeao)
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(saudeLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeLeao)
                    .addGroup(areaEnergia4Layout.createSequentialGroup()
                        .addComponent(sorteLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteLeao)
                    .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia4Layout.setVerticalGroup(
            areaEnergia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLeao)
                .addGap(16, 16, 16)
                .addComponent(trabalhoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeLeao)
                .addGap(15, 15, 15)
                .addComponent(sorteLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteLeao)
                .addGap(51, 51, 51))
        );

        leao.add(areaEnergia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemLeao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemLeao.setText("Mensagem do dia");

        txtMensagemLeao.setColumns(20);
        txtMensagemLeao.setRows(5);
        txMensagemAries4.setViewportView(txtMensagemLeao);

        btnCopiarMsgLeao.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgLeao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLeaoLayout = new javax.swing.GroupLayout(areaMensagemLeao);
        areaMensagemLeao.setLayout(areaMensagemLeaoLayout);
        areaMensagemLeaoLayout.setHorizontalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries4, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemLeaoLayout.setVerticalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries4, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLeao)
                .addGap(20, 20, 20))
        );

        leao.add(areaMensagemLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));
        leao.add(fundoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Leão", leao);

        virgem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaVirgem.setText("Características");

        pfortesVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesVirgem.setText("Pontos Fortes:");

        pMelhorarVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarVirgem.setText("Pontos a Melhorar:");

        txFortesVirgem.setColumns(20);
        txFortesVirgem.setRows(5);
        jScrollPane11.setViewportView(txFortesVirgem);

        txMelhorarVirgem.setColumns(20);
        txMelhorarVirgem.setRows(5);
        jScrollPane12.setViewportView(txMelhorarVirgem);

        javax.swing.GroupLayout areaCaracteristicas5Layout = new javax.swing.GroupLayout(areaCaracteristicas5);
        areaCaracteristicas5.setLayout(areaCaracteristicas5Layout);
        areaCaracteristicas5Layout.setHorizontalGroup(
            areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11)
                    .addComponent(pMelhorarVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane12))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas5Layout.setVerticalGroup(
            areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12)
                .addGap(27, 27, 27))
        );

        virgem.add(areaCaracteristicas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        tituloVirgem.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloVirgem.setText("Virgem");

        periodoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoVirgem.setText("PERIODO:");

        elementoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoVirgem.setText("ELEMENTO:");

        planetaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaVirgem.setText("PLANETA REGENTE:");

        corVirgem.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corVirgem.setText("COR:");

        numeroVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroVirgem.setText("NÚMERO DA SORTE:");

        javax.swing.GroupLayout areaInformacoes5Layout = new javax.swing.GroupLayout(areaInformacoes5);
        areaInformacoes5.setLayout(areaInformacoes5Layout);
        areaInformacoes5Layout.setHorizontalGroup(
            areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes5Layout.createSequentialGroup()
                            .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaVirgem)
                                .addComponent(tfNumeroVirgem)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes5Layout.createSequentialGroup()
                            .addComponent(elementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoVirgem))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes5Layout.createSequentialGroup()
                            .addComponent(periodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes5Layout.createSequentialGroup()
                            .addComponent(corVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorVirgem))))
                .addGap(10, 10, 10))
        );
        areaInformacoes5Layout.setVerticalGroup(
            areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoVirgem)
                    .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoVirgem)
                    .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaVirgem)
                    .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corVirgem)
                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroVirgem)
                    .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        virgem.add(areaInformacoes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoVirgem.setText("Previsão do Dia:");

        txtPrevisaoVirgem.setColumns(20);
        txtPrevisaoVirgem.setRows(5);
        txPrevisaoVirgem.setViewportView(txtPrevisaoVirgem);

        btnAtualizarPrevisaoVirgem.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoVirgem.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao5Layout = new javax.swing.GroupLayout(areaPrevisao5);
        areaPrevisao5.setLayout(areaPrevisao5Layout);
        areaPrevisao5Layout.setHorizontalGroup(
            areaPrevisao5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoVirgem)
                    .addGroup(areaPrevisao5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao5Layout.setVerticalGroup(
            areaPrevisao5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        virgem.add(areaPrevisao5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaVirgem.setText("Energia do Dia");

        trabalhoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoVirgem.setText("Trabalho:");

        sorteVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteVirgem.setText("Sorte:");

        amorVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorVirgem.setText("Amor:");

        saudeVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeVirgem.setText("Saúde:");

        javax.swing.GroupLayout areaEnergia5Layout = new javax.swing.GroupLayout(areaEnergia5);
        areaEnergia5.setLayout(areaEnergia5Layout);
        areaEnergia5Layout.setHorizontalGroup(
            areaEnergia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(amorVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorVirgem)
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(trabalhoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoVirgem)
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(saudeVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeVirgem)
                    .addGroup(areaEnergia5Layout.createSequentialGroup()
                        .addComponent(sorteVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteVirgem)
                    .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia5Layout.setVerticalGroup(
            areaEnergia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorVirgem)
                .addGap(16, 16, 16)
                .addComponent(trabalhoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeVirgem)
                .addGap(15, 15, 15)
                .addComponent(sorteVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteVirgem)
                .addGap(51, 51, 51))
        );

        virgem.add(areaEnergia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemVirgem.setText("Mensagem do dia");

        txtMensagemVirgem.setColumns(20);
        txtMensagemVirgem.setRows(5);
        txMensagemVirgem.setViewportView(txtMensagemVirgem);

        btnCopiarMsgVirgem.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgVirgem.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem5Layout = new javax.swing.GroupLayout(areaMensagem5);
        areaMensagem5.setLayout(areaMensagem5Layout);
        areaMensagem5Layout.setHorizontalGroup(
            areaMensagem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagem5Layout.setVerticalGroup(
            areaMensagem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgVirgem)
                .addGap(20, 20, 20))
        );

        virgem.add(areaMensagem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));
        virgem.add(fundoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Virgem", virgem);

        libra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaLibra.setText("Características");

        pfortesLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesLibra.setText("Pontos Fortes:");

        pMelhorarLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarLibra.setText("Pontos a Melhorar:");

        txFortesLibra.setColumns(20);
        txFortesLibra.setRows(5);
        jScrollPane13.setViewportView(txFortesLibra);

        txMelhorarLibra.setColumns(20);
        txMelhorarLibra.setRows(5);
        jScrollPane14.setViewportView(txMelhorarLibra);

        javax.swing.GroupLayout areaCaracteristicas6Layout = new javax.swing.GroupLayout(areaCaracteristicas6);
        areaCaracteristicas6.setLayout(areaCaracteristicas6Layout);
        areaCaracteristicas6Layout.setHorizontalGroup(
            areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13)
                    .addComponent(pMelhorarLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane14))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas6Layout.setVerticalGroup(
            areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14)
                .addGap(27, 27, 27))
        );

        libra.add(areaCaracteristicas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        tituloLibra.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLibra.setText("Libra");

        periodoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoLibra.setText("PERIODO:");

        elementoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoLibra.setText("ELEMENTO:");

        planetaLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaLibra.setText("PLANETA REGENTE:");

        corLibra.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corLibra.setText("COR:");

        numeroLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroLibra.setText("NÚMERO DA SORTE:");

        javax.swing.GroupLayout areaInformacoesLibraLayout = new javax.swing.GroupLayout(areaInformacoesLibra);
        areaInformacoesLibra.setLayout(areaInformacoesLibraLayout);
        areaInformacoesLibraLayout.setHorizontalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                            .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaLibra)
                                .addComponent(tfNumeroLibra)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibraLayout.createSequentialGroup()
                            .addComponent(elementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoLibra))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibraLayout.createSequentialGroup()
                            .addComponent(periodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                            .addComponent(corLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorLibra))))
                .addGap(10, 10, 10))
        );
        areaInformacoesLibraLayout.setVerticalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLibra)
                    .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLibra)
                    .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLibra)
                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLibra)
                    .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLibra)
                    .addComponent(tfNumeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        libra.add(areaInformacoesLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoLibra.setText("Previsão do Dia:");

        txtPrevisaoLibra.setColumns(20);
        txtPrevisaoLibra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtPrevisaoLibra.setRows(5);
        txPrevisaoLibra.setViewportView(txtPrevisaoLibra);

        btnAtualizarPrevisaoLibra.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoLibra.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoLibraLayout = new javax.swing.GroupLayout(areaPrevisaoLibra);
        areaPrevisaoLibra.setLayout(areaPrevisaoLibraLayout);
        areaPrevisaoLibraLayout.setHorizontalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoLibra)
                    .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoLibraLayout.setVerticalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        libra.add(areaPrevisaoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaLibra.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaLibra.setText("Energia do Dia");

        trabalhoLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoLibra.setText("Trabalho:");

        sorteLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteLibra.setText("Sorte:");

        amorLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorLibra.setText("Amor:");

        saudeLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeLibra.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaLibraLayout = new javax.swing.GroupLayout(areaEnergiaLibra);
        areaEnergiaLibra.setLayout(areaEnergiaLibraLayout);
        areaEnergiaLibraLayout.setHorizontalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(amorLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(trabalhoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(saudeLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addComponent(sorteLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteLibra)
                    .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaLibraLayout.setVerticalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLibra)
                .addGap(16, 16, 16)
                .addComponent(trabalhoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeLibra)
                .addGap(15, 15, 15)
                .addComponent(sorteLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteLibra)
                .addGap(51, 51, 51))
        );

        libra.add(areaEnergiaLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemLibra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemLibra.setText("Mensagem do dia");

        txtMensagemLibra.setColumns(20);
        txtMensagemLibra.setRows(5);
        txMensagemLibra.setViewportView(txtMensagemLibra);

        btnCopiarMsgLibra.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgLibra.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLibraLayout = new javax.swing.GroupLayout(areaMensagemLibra);
        areaMensagemLibra.setLayout(areaMensagemLibraLayout);
        areaMensagemLibraLayout.setHorizontalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemLibraLayout.setVerticalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLibra)
                .addGap(20, 20, 20))
        );

        libra.add(areaMensagemLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));
        libra.add(fundoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Libra", libra);

        sagitario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaSagitario.setText("Características");

        pfortesSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesSagitario.setText("Pontos Fortes:");

        pMelhorarSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarSagitario.setText("Pontos a Melhorar:");

        txFortesSagitario.setColumns(20);
        txFortesSagitario.setRows(5);
        jScrollPane17.setViewportView(txFortesSagitario);

        txMelhorarSagitario.setColumns(20);
        txMelhorarSagitario.setRows(5);
        jScrollPane18.setViewportView(txMelhorarSagitario);

        javax.swing.GroupLayout areaCaracteristicasSagitarioLayout = new javax.swing.GroupLayout(areaCaracteristicasSagitario);
        areaCaracteristicasSagitario.setLayout(areaCaracteristicasSagitarioLayout);
        areaCaracteristicasSagitarioLayout.setHorizontalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane17)
                    .addComponent(pMelhorarSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane18))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasSagitarioLayout.setVerticalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18)
                .addGap(27, 27, 27))
        );

        sagitario.add(areaCaracteristicasSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        tituloAriesSagitario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAriesSagitario.setText("Sagiatário");

        periodoAriesSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAriesSagitario.setText("PERIODO:");

        elementoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoSagitario.setText("ELEMENTO:");

        planetaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaSagitario.setText("PLANETA REGENTE:");

        corSagitario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corSagitario.setText("COR:");

        numeroSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroSagitario.setText("NÚMERO DA SORTE:");

        javax.swing.GroupLayout areaInformacoesSagitarioLayout = new javax.swing.GroupLayout(areaInformacoesSagitario);
        areaInformacoesSagitario.setLayout(areaInformacoesSagitarioLayout);
        areaInformacoesSagitarioLayout.setHorizontalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAriesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaSagitario)
                                .addComponent(tfNumeroSagitario)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(elementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoSagitario))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(periodoAriesSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(corSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorSagitario))))
                .addGap(10, 10, 10))
        );
        areaInformacoesSagitarioLayout.setVerticalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAriesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAriesSagitario)
                    .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoSagitario)
                    .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaSagitario)
                    .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corSagitario)
                    .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroSagitario)
                    .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        sagitario.add(areaInformacoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoSagitario.setText("Previsão do Dia:");

        txtPrevisaoSagitario.setColumns(20);
        txtPrevisaoSagitario.setRows(5);
        txPrevisaoAries8.setViewportView(txtPrevisaoSagitario);

        btnAtualizarPrevisaoSagitario.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoSagitario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoSagitarioLayout = new javax.swing.GroupLayout(areaPrevisaoSagitario);
        areaPrevisaoSagitario.setLayout(areaPrevisaoSagitarioLayout);
        areaPrevisaoSagitarioLayout.setHorizontalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries8)
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoSagitarioLayout.setVerticalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries8, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        sagitario.add(areaPrevisaoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaSagitario.setText("Energia do Dia");

        trabalhoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoSagitario.setText("Trabalho:");

        sorteSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteSagitario.setText("Sorte:");

        amorSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorSagitario.setText("Amor:");

        saudeSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeSagitario.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaSagitarioLayout = new javax.swing.GroupLayout(areaEnergiaSagitario);
        areaEnergiaSagitario.setLayout(areaEnergiaSagitarioLayout);
        areaEnergiaSagitarioLayout.setHorizontalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(amorSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(trabalhoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(saudeSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addComponent(sorteSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteSagitario)
                    .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaSagitarioLayout.setVerticalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorSagitario)
                .addGap(16, 16, 16)
                .addComponent(trabalhoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeSagitario)
                .addGap(15, 15, 15)
                .addComponent(sorteSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteSagitario)
                .addGap(51, 51, 51))
        );

        sagitario.add(areaEnergiaSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemSagitario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemSagitario.setText("Mensagem do dia");

        txtMensagemSagitario.setColumns(20);
        txtMensagemSagitario.setRows(5);
        txMensagemAries8.setViewportView(txtMensagemSagitario);

        btnCopiarMsgSagitario.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgSagitario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemSagitarioLayout = new javax.swing.GroupLayout(areaMensagemSagitario);
        areaMensagemSagitario.setLayout(areaMensagemSagitarioLayout);
        areaMensagemSagitarioLayout.setHorizontalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries8, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemSagitarioLayout.setVerticalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries8, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgSagitario)
                .addGap(20, 20, 20))
        );

        sagitario.add(areaMensagemSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));
        sagitario.add(fundoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Sagitário", sagitario);

        capricornio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaCapricornio.setText("Características");

        pfortesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesCapricornio.setText("Pontos Fortes:");

        pMelhorarCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarCapricornio.setText("Pontos a Melhorar:");

        txFortesCapricornio.setColumns(20);
        txFortesCapricornio.setRows(5);
        jScrollPane19.setViewportView(txFortesCapricornio);

        txMelhorarCapricornio.setColumns(20);
        txMelhorarCapricornio.setRows(5);
        jScrollPane20.setViewportView(txMelhorarCapricornio);

        javax.swing.GroupLayout areaCaracteristicasCapricornioLayout = new javax.swing.GroupLayout(areaCaracteristicasCapricornio);
        areaCaracteristicasCapricornio.setLayout(areaCaracteristicasCapricornioLayout);
        areaCaracteristicasCapricornioLayout.setHorizontalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane19)
                    .addComponent(pMelhorarCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane20))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasCapricornioLayout.setVerticalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20)
                .addGap(27, 27, 27))
        );

        capricornio.add(areaCaracteristicasCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        tituloAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAriesCapricornio.setText("Capricórnio");

        periodoAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAriesCapricornio.setText("PERIODO:");

        elementoAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoAriesCapricornio.setText("ELEMENTO:");

        planetaAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaAriesCapricornio.setText("PLANETA REGENTE:");

        corAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corAriesCapricornio.setText("COR:");

        numeroAriesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroAriesCapricornio.setText("NÚMERO DA SORTE:");

        javax.swing.GroupLayout areaInformacoesCapricornioLayout = new javax.swing.GroupLayout(areaInformacoesCapricornio);
        areaInformacoesCapricornio.setLayout(areaInformacoesCapricornioLayout);
        areaInformacoesCapricornioLayout.setHorizontalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAriesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaAriesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroAriesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAriesCapricornio)
                                .addComponent(tfNumeroAriesCapricornio)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(elementoAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAriesCapricornio))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(periodoAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(corAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAriesCapricornio))))
                .addGap(10, 10, 10))
        );
        areaInformacoesCapricornioLayout.setVerticalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAriesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAriesCapricornio)
                    .addComponent(tfPeriodoAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAriesCapricornio)
                    .addComponent(tfElementoAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAriesCapricornio)
                    .addComponent(tfPlanetaAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAriesCapricornio)
                    .addComponent(tfCorAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAriesCapricornio)
                    .addComponent(tfNumeroAriesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        capricornio.add(areaInformacoesCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoCapricornio.setText("Previsão do Dia:");

        txtPrevisaoCapricornio.setColumns(20);
        txtPrevisaoCapricornio.setRows(5);
        txPrevisaoAries9.setViewportView(txtPrevisaoCapricornio);

        btnAtualizarPrevisaoCapricornio.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoCapricornio.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoCapricornioLayout = new javax.swing.GroupLayout(areaPrevisaoCapricornio);
        areaPrevisaoCapricornio.setLayout(areaPrevisaoCapricornioLayout);
        areaPrevisaoCapricornioLayout.setHorizontalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries9)
                    .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoCapricornioLayout.setVerticalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        capricornio.add(areaPrevisaoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaAries9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaAries9.setText("Energia do Dia");

        trabalhoAries9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoAries9.setText("Trabalho:");

        sorteAries9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteAries9.setText("Sorte:");

        amorAries9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorAries9.setText("Amor:");

        saudeAries9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeAries9.setText("Saúde:");

        javax.swing.GroupLayout areaCapricornioLayout = new javax.swing.GroupLayout(areaCapricornio);
        areaCapricornio.setLayout(areaCapricornioLayout);
        areaCapricornioLayout.setHorizontalGroup(
            areaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCapricornioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(amorAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorAries9)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(trabalhoAries9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoAries9)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(saudeAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeAries9)
                    .addGroup(areaCapricornioLayout.createSequentialGroup()
                        .addComponent(sorteAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteAries9)
                    .addComponent(tituloEnergiaAries9, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaCapricornioLayout.setVerticalGroup(
            areaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCapricornioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaAries9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorAries9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries9)
                .addGap(16, 16, 16)
                .addComponent(trabalhoAries9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAries9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAries9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAries9)
                .addGap(15, 15, 15)
                .addComponent(sorteAries9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAries9)
                .addGap(51, 51, 51))
        );

        capricornio.add(areaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemCapricornio.setText("Mensagem do dia");

        txtMensagemCapricornio.setColumns(20);
        txtMensagemCapricornio.setRows(5);
        txMensagemAries9.setViewportView(txtMensagemCapricornio);

        btnCopiarMsgCapricornio.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgCapricornio.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemCapricornioLayout = new javax.swing.GroupLayout(areaMensagemCapricornio);
        areaMensagemCapricornio.setLayout(areaMensagemCapricornioLayout);
        areaMensagemCapricornioLayout.setHorizontalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries9, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemCapricornioLayout.setVerticalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries9, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCapricornio)
                .addGap(20, 20, 20))
        );

        capricornio.add(areaMensagemCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));
        capricornio.add(fundoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Capricórnio", capricornio);

        aquario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaAquario.setText("Características");

        pfortesAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesAquario.setText("Pontos Fortes:");

        pMelhorarAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarAquario.setText("Pontos a Melhorar:");

        txFortesAquario.setColumns(20);
        txFortesAquario.setRows(5);
        jScrollPane21.setViewportView(txFortesAquario);

        txMelhorarAquario.setColumns(20);
        txMelhorarAquario.setRows(5);
        jScrollPane22.setViewportView(txMelhorarAquario);

        javax.swing.GroupLayout areaCaracteristicasAquarioLayout = new javax.swing.GroupLayout(areaCaracteristicasAquario);
        areaCaracteristicasAquario.setLayout(areaCaracteristicasAquarioLayout);
        areaCaracteristicasAquarioLayout.setHorizontalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane21)
                    .addComponent(pMelhorarAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane22))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasAquarioLayout.setVerticalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22)
                .addGap(27, 27, 27))
        );

        aquario.add(areaCaracteristicasAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        tituloAquario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAquario.setText("Aquário");

        periodoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAquario.setText("PERIODO:");

        elementoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoAquario.setText("ELEMENTO:");

        planetaAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaAquario.setText("PLANETA REGENTE:");

        corAquario.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corAquario.setText("COR:");

        numeroAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroAquario.setText("NÚMERO DA SORTE:");

        javax.swing.GroupLayout areaInformacoesAquarioLayout = new javax.swing.GroupLayout(areaInformacoesAquario);
        areaInformacoesAquario.setLayout(areaInformacoesAquarioLayout);
        areaInformacoesAquarioLayout.setHorizontalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAquario)
                                .addComponent(tfNumeroAquario)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAquarioLayout.createSequentialGroup()
                            .addComponent(elementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAquario))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAquarioLayout.createSequentialGroup()
                            .addComponent(periodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                            .addComponent(corAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAquario))))
                .addGap(10, 10, 10))
        );
        areaInformacoesAquarioLayout.setVerticalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAquario)
                    .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAquario)
                    .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAquario)
                    .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAquario)
                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAquario)
                    .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        aquario.add(areaInformacoesAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoAquario.setText("Previsão do Dia:");

        txtPrevisaoAquario.setColumns(20);
        txtPrevisaoAquario.setRows(5);
        txPrevisaoAries10.setViewportView(txtPrevisaoAquario);

        btnAtualizarPrevisaoAquario.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoAquario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoAquarioLayout = new javax.swing.GroupLayout(areaPrevisaoAquario);
        areaPrevisaoAquario.setLayout(areaPrevisaoAquarioLayout);
        areaPrevisaoAquarioLayout.setHorizontalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries10)
                    .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoAquarioLayout.setVerticalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries10, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        aquario.add(areaPrevisaoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaAquario.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaAquario.setText("Energia do Dia");

        trabalhoAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoAquario.setText("Trabalho:");

        sorteAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteAquario.setText("Sorte:");

        amorAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorAquario.setText("Amor:");

        saudeAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeAquario.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaAquarioLayout = new javax.swing.GroupLayout(areaEnergiaAquario);
        areaEnergiaAquario.setLayout(areaEnergiaAquarioLayout);
        areaEnergiaAquarioLayout.setHorizontalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(amorAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorAquario)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(trabalhoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoAquario)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(saudeAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeAquario)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addComponent(sorteAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteAquario)
                    .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaAquarioLayout.setVerticalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAquario)
                .addGap(16, 16, 16)
                .addComponent(trabalhoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAquario)
                .addGap(15, 15, 15)
                .addComponent(sorteAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAquario)
                .addGap(51, 51, 51))
        );

        aquario.add(areaEnergiaAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemAquario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemAquario.setText("Mensagem do dia");

        txtMensagemAquario.setColumns(20);
        txtMensagemAquario.setRows(5);
        txMensagemAries10.setViewportView(txtMensagemAquario);

        btnCopiarMsgAquario.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgAquario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemAquarioLayout = new javax.swing.GroupLayout(areaMensagemAquario);
        areaMensagemAquario.setLayout(areaMensagemAquarioLayout);
        areaMensagemAquarioLayout.setHorizontalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries10, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemAquarioLayout.setVerticalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemAries10, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgAquario)
                .addGap(20, 20, 20))
        );

        aquario.add(areaMensagemAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));
        aquario.add(fundoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Aquário", aquario);

        peixes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaAries11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaAries11.setText("Características");

        pfortesAries11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesAries11.setText("Pontos Fortes:");

        pMelhorarAries11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarAries11.setText("Pontos a Melhorar:");

        txFortesAries11.setColumns(20);
        txFortesAries11.setRows(5);
        jScrollPane23.setViewportView(txFortesAries11);

        txMelhorarAries11.setColumns(20);
        txMelhorarAries11.setRows(5);
        jScrollPane24.setViewportView(txMelhorarAries11);

        javax.swing.GroupLayout areaCaracteristicas11Layout = new javax.swing.GroupLayout(areaCaracteristicas11);
        areaCaracteristicas11.setLayout(areaCaracteristicas11Layout);
        areaCaracteristicas11Layout.setHorizontalGroup(
            areaCaracteristicas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaAries11, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesAries11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane23)
                    .addComponent(pMelhorarAries11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane24))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas11Layout.setVerticalGroup(
            areaCaracteristicas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaAries11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesAries11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAries11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24)
                .addGap(27, 27, 27))
        );

        peixes.add(areaCaracteristicas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        tituloAries11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloAries11.setText("Peixes");

        periodoAries11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoAries11.setText("PERIODO:");

        elementoAries11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoAries11.setText("ELEMENTO:");

        planetaAries11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaAries11.setText("PLANETA REGENTE:");

        corAries11.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corAries11.setText("COR:");

        numeroAries11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroAries11.setText("NÚMERO DA SORTE:");

        javax.swing.GroupLayout areaInformacoes11Layout = new javax.swing.GroupLayout(areaInformacoes11);
        areaInformacoes11.setLayout(areaInformacoes11Layout);
        areaInformacoes11Layout.setHorizontalGroup(
            areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAries11, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes11Layout.createSequentialGroup()
                            .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaAries11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroAries11, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaAries11)
                                .addComponent(tfNumeroAries11)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes11Layout.createSequentialGroup()
                            .addComponent(elementoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoAries11))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes11Layout.createSequentialGroup()
                            .addComponent(periodoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes11Layout.createSequentialGroup()
                            .addComponent(corAries11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorAries11))))
                .addGap(10, 10, 10))
        );
        areaInformacoes11Layout.setVerticalGroup(
            areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloAries11, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAries11)
                    .addComponent(tfPeriodoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAries11)
                    .addComponent(tfElementoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAries11)
                    .addComponent(tfPlanetaAries11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAries11)
                    .addComponent(tfCorAries11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAries11)
                    .addComponent(tfNumeroAries11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        peixes.add(areaInformacoes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoPeixes.setText("Previsão do Dia:");

        txtPrevisaoPeixes.setColumns(20);
        txtPrevisaoPeixes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtPrevisaoPeixes.setRows(5);
        txPrevisaoPeixes.setViewportView(txtPrevisaoPeixes);

        btnAtualizarPrevisaoPeixes.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoPeixes.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao11Layout = new javax.swing.GroupLayout(areaPrevisao11);
        areaPrevisao11.setLayout(areaPrevisao11Layout);
        areaPrevisao11Layout.setHorizontalGroup(
            areaPrevisao11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoPeixes)
                    .addGroup(areaPrevisao11Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao11Layout.setVerticalGroup(
            areaPrevisao11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        peixes.add(areaPrevisao11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaPeixes.setText("Energia do Dia");

        trabalhoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoPeixes.setText("Trabalho:");

        sortePeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sortePeixes.setText("Sorte:");

        amorPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorPeixes.setText("Amor:");

        saudePeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudePeixes.setText("Saúde:");

        javax.swing.GroupLayout areaEnergia11Layout = new javax.swing.GroupLayout(areaEnergia11);
        areaEnergia11.setLayout(areaEnergia11Layout);
        areaEnergia11Layout.setHorizontalGroup(
            areaEnergia11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia11Layout.createSequentialGroup()
                        .addComponent(amorPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorPeixes)
                    .addGroup(areaEnergia11Layout.createSequentialGroup()
                        .addComponent(trabalhoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoPeixes)
                    .addGroup(areaEnergia11Layout.createSequentialGroup()
                        .addComponent(saudePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudePeixes)
                    .addGroup(areaEnergia11Layout.createSequentialGroup()
                        .addComponent(sortePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSortePeixes)
                    .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia11Layout.setVerticalGroup(
            areaEnergia11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorPeixes)
                .addGap(16, 16, 16)
                .addComponent(trabalhoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudePeixes)
                .addGap(15, 15, 15)
                .addComponent(sortePeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSortePeixes)
                .addGap(51, 51, 51))
        );

        peixes.add(areaEnergia11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemPeixes.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemPeixes.setText("Mensagem do dia");

        txtMensagemPeixes.setColumns(20);
        txtMensagemPeixes.setRows(5);
        txMensagemPeixes.setViewportView(txtMensagemPeixes);

        btnCopiarMsgPeixes.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgPeixes.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem11Layout = new javax.swing.GroupLayout(areaMensagem11);
        areaMensagem11.setLayout(areaMensagem11Layout);
        areaMensagem11Layout.setHorizontalGroup(
            areaMensagem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagem11Layout.setVerticalGroup(
            areaMensagem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgPeixes)
                .addGap(20, 20, 20))
        );

        peixes.add(areaMensagem11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));
        peixes.add(fundoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Peixes", peixes);

        aries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaAries.setBackground(new java.awt.Color(0, 0, 0));
        tituloCaracteristicaAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloCaracteristicaAries.setText("Características");

        pfortesAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesAries.setText("Pontos Fortes:");

        pMelhorarAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarAries.setText("Pontos a Melhorar:");

        txFortesAries.setEditable(false);
        txFortesAries.setColumns(20);
        txFortesAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txFortesAries.setRows(5);
        txFortesAries.setText("Coragem, iniciativa e determinação. \nGosta de novos desafios, \ndemonstra entusiasmo e tem facilidade\n para tomar a frente de projetos.");
        jScrollPane1.setViewportView(txFortesAries);

        txMelhorarAries.setColumns(20);
        txMelhorarAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txMelhorarAries.setRows(5);
        txMelhorarAries.setText("Desenvolver a paciência, controlar a\nimpulsividade e ouvir outras opiniões. \nRefletir antes de agir pode evitar conflitos \ne decisões precipitadas.");
        jScrollPane2.setViewportView(txMelhorarAries);

        javax.swing.GroupLayout areaCaracteristicasLayout = new javax.swing.GroupLayout(areaCaracteristicas);
        areaCaracteristicas.setLayout(areaCaracteristicasLayout);
        areaCaracteristicasLayout.setHorizontalGroup(
            areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfortesAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
            .addComponent(tituloCaracteristicaAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pMelhorarAries, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaCaracteristicasLayout.setVerticalGroup(
            areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfortesAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        aries.add(areaCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 500, 360));

        periodoAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoAries.setText("PERIODO:");

        elementoAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoAries.setText("ELEMENTO:");

        planetaAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaAries.setText("PLANETA REGENTE:");

        corAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corAries.setText("COR:");

        numeroAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroAries.setText("NÚMERO DA SORTE:");

        tfPeriodoAries.setEditable(false);
        tfPeriodoAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPeriodoAries.setText("21/03 a 19/04");

        tfElementoAries.setEditable(false);
        tfElementoAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfElementoAries.setText("Fogo");

        tfPlanetaAries.setEditable(false);
        tfPlanetaAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPlanetaAries.setText("Marte");

        tfCorAries.setEditable(false);
        tfCorAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfCorAries.setText("Vermelho");

        tfNumeroAries.setEditable(false);
        tfNumeroAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfNumeroAries.setText("9");

        tituloAries.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloAries.setText("ÁRIES");

        javax.swing.GroupLayout areaInformacoesLayout = new javax.swing.GroupLayout(areaInformacoes);
        areaInformacoes.setLayout(areaInformacoesLayout);
        areaInformacoesLayout.setHorizontalGroup(
            areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLayout.createSequentialGroup()
                                        .addComponent(corAries, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLayout.createSequentialGroup()
                                        .addComponent(numeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addComponent(planetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addComponent(elementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addComponent(periodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesLayout.setVerticalGroup(
            areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(tituloAries)
                .addGap(134, 134, 134)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAries)
                    .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAries)
                    .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetaAries))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAries)
                    .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAries)
                    .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        aries.add(areaInformacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 380, 730));

        previsaoAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        previsaoAries.setText("Previsão do Dia:");

        txtPrevisaoAries.setEditable(false);
        txtPrevisaoAries.setColumns(20);
        txtPrevisaoAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrevisaoAries.setRows(5);
        txPrevisaoAries.setViewportView(txtPrevisaoAries);

        btnAtualizarPrevisaoAries.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoAries.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoAries.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoLayout = new javax.swing.GroupLayout(areaPrevisao);
        areaPrevisao.setLayout(areaPrevisaoLayout);
        areaPrevisaoLayout.setHorizontalGroup(
            areaPrevisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoLayout.createSequentialGroup()
                        .addComponent(txPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(previsaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)))
        );
        areaPrevisaoLayout.setVerticalGroup(
            areaPrevisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(previsaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        aries.add(areaPrevisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 500, 350));

        tituloEnergiaAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEnergiaAries.setText("Energia do Dia");

        trabalhoAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoAries.setText("Trabalho:");

        sorteAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteAries.setText("Sorte:");

        amorAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorAries.setText("Amor:");

        saudeAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeAries.setText("Saúde:");

        tfAmorAries.setEditable(false);
        tfAmorAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAmorAries.setText("85%");

        tfTrabalhoAries.setEditable(false);
        tfTrabalhoAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfTrabalhoAries.setText("90%");

        tfSaudeAries.setEditable(false);
        tfSaudeAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSaudeAries.setText("75%");

        tfSorteAries.setEditable(false);
        tfSorteAries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfSorteAries.setText("80%");

        javax.swing.GroupLayout areaEnergiaLayout = new javax.swing.GroupLayout(areaEnergia);
        areaEnergia.setLayout(areaEnergiaLayout);
        areaEnergiaLayout.setHorizontalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(amorAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(trabalhoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(264, 264, 264))
                    .addComponent(tfTrabalhoAries)
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(saudeAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeAries)
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addComponent(sorteAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteAries)
                    .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAmorAries))
                .addContainerGap())
        );
        areaEnergiaLayout.setVerticalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteAries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAries)
                .addGap(87, 87, 87))
        );

        aries.add(areaEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 520, 360));

        tituloMensagemAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemAries.setText("Mensagem do dia");

        txtMensagemAries.setColumns(20);
        txtMensagemAries.setRows(5);
        txMensagemAries.setViewportView(txtMensagemAries);

        btnCopiarMsgAries.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMsgAries.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgAries.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLayout = new javax.swing.GroupLayout(areaMensagem);
        areaMensagem.setLayout(areaMensagemLayout);
        areaMensagemLayout.setHorizontalGroup(
            areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgAries, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemLayout.setVerticalGroup(
            areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txMensagemAries, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(btnCopiarMsgAries)
                .addGap(20, 20, 20))
        );

        aries.add(areaMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 390, 540, 350));

        fundoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\PedroLeite\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\Assets\\fundo.jpg!d")); // NOI18N
        aries.add(fundoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 1930, 1090));

        areaAbas.addTab("Áries", aries);

        cancer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaCancer.setText("Características");

        pfortesCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesCancer.setText("Pontos Fortes:");

        pMelhorarCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarCancer.setText("Pontos a Melhorar:");

        txFortesCancer.setColumns(20);
        txFortesCancer.setRows(5);
        jScrollPane7.setViewportView(txFortesCancer);

        txMelhorarCancer.setColumns(20);
        txMelhorarCancer.setRows(5);
        jScrollPane8.setViewportView(txMelhorarCancer);

        javax.swing.GroupLayout areaCaracteristicas3Layout = new javax.swing.GroupLayout(areaCaracteristicas3);
        areaCaracteristicas3.setLayout(areaCaracteristicas3Layout);
        areaCaracteristicas3Layout.setHorizontalGroup(
            areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addComponent(pMelhorarCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas3Layout.setVerticalGroup(
            areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8)
                .addGap(27, 27, 27))
        );

        cancer.add(areaCaracteristicas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        tituloCancer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloCancer.setText("Câncer");

        periodoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoCancer.setText("PERIODO:");

        elementoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoCancer.setText("ELEMENTO:");

        planetaCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaCancer.setText("PLANETA REGENTE:");

        corCancer.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corCancer.setText("COR:");

        numeroCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroCancer.setText("NÚMERO DA SORTE:");

        javax.swing.GroupLayout areaInformacoes3Layout = new javax.swing.GroupLayout(areaInformacoes3);
        areaInformacoes3.setLayout(areaInformacoes3Layout);
        areaInformacoes3Layout.setHorizontalGroup(
            areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoes3Layout.createSequentialGroup()
                            .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaCancer)
                                .addComponent(tfNumeroCancer)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes3Layout.createSequentialGroup()
                            .addComponent(elementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoCancer))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes3Layout.createSequentialGroup()
                            .addComponent(periodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoes3Layout.createSequentialGroup()
                            .addComponent(corCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorCancer))))
                .addGap(10, 10, 10))
        );
        areaInformacoes3Layout.setVerticalGroup(
            areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoCancer)
                    .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCancer)
                    .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCancer)
                    .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCancer)
                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCancer)
                    .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        cancer.add(areaInformacoes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoCancer.setText("Previsão do Dia:");

        txtPrevisaoCancer.setColumns(20);
        txtPrevisaoCancer.setRows(5);
        txPrevisaoCancer.setViewportView(txtPrevisaoCancer);

        btnAtualizarPrevisaoCancer.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoCancer.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao3Layout = new javax.swing.GroupLayout(areaPrevisao3);
        areaPrevisao3.setLayout(areaPrevisao3Layout);
        areaPrevisao3Layout.setHorizontalGroup(
            areaPrevisao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoCancer)
                    .addGroup(areaPrevisao3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao3Layout.setVerticalGroup(
            areaPrevisao3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        cancer.add(areaPrevisao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaCancer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaCancer.setText("Energia do Dia");

        trabalhoCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoCancer.setText("Trabalho:");

        sorteCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteCancer.setText("Sorte:");

        amorCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorCancer.setText("Amor:");

        saudeCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeCancer.setText("Saúde:");

        javax.swing.GroupLayout areaEnergia3Layout = new javax.swing.GroupLayout(areaEnergia3);
        areaEnergia3.setLayout(areaEnergia3Layout);
        areaEnergia3Layout.setHorizontalGroup(
            areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(amorCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorCancer)
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(trabalhoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoCancer)
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(saudeCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeCancer)
                    .addGroup(areaEnergia3Layout.createSequentialGroup()
                        .addComponent(sorteCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteCancer)
                    .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia3Layout.setVerticalGroup(
            areaEnergia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCancer)
                .addGap(16, 16, 16)
                .addComponent(trabalhoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeCancer)
                .addGap(15, 15, 15)
                .addComponent(sorteCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteCancer)
                .addGap(51, 51, 51))
        );

        cancer.add(areaEnergia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemCancer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemCancer.setText("Mensagem do dia");

        txtMensagemCancer.setColumns(20);
        txtMensagemCancer.setRows(5);
        txMensagemCancer.setViewportView(txtMensagemCancer);

        btnCopiarMsgCancer.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgCancer.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem3Layout = new javax.swing.GroupLayout(areaMensagem3);
        areaMensagem3.setLayout(areaMensagem3Layout);
        areaMensagem3Layout.setHorizontalGroup(
            areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagem3Layout.setVerticalGroup(
            areaMensagem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCancer)
                .addGap(20, 20, 20))
        );

        cancer.add(areaMensagem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));
        cancer.add(fundoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Câncer", cancer);

        escorpiao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaEscorpiao.setText("Características");

        pfortesEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesEscorpiao.setText("Pontos Fortes:");

        pMelhorarEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarEscorpiao.setText("Pontos a Melhorar:");

        txFortesEscorpiao.setColumns(20);
        txFortesEscorpiao.setRows(5);
        jScrollPane15.setViewportView(txFortesEscorpiao);

        txMelhorarEscorpiao.setColumns(20);
        txMelhorarEscorpiao.setRows(5);
        jScrollPane16.setViewportView(txMelhorarEscorpiao);

        javax.swing.GroupLayout areaCaracteristicasEscorpiaoLayout = new javax.swing.GroupLayout(areaCaracteristicasEscorpiao);
        areaCaracteristicasEscorpiao.setLayout(areaCaracteristicasEscorpiaoLayout);
        areaCaracteristicasEscorpiaoLayout.setHorizontalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane15)
                    .addComponent(pMelhorarEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane16))
                .addGap(26, 26, 26))
        );
        areaCaracteristicasEscorpiaoLayout.setVerticalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16)
                .addGap(27, 27, 27))
        );

        escorpiao.add(areaCaracteristicasEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        tituloEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEscorpiao.setText("Escorpião");

        periodoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoEscorpiao.setText("PERIODO:");

        elementoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoEscorpiao.setText("ELEMENTO:");

        planetaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaEscorpiao.setText("PLANETA REGENTE:");

        corEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corEscorpiao.setText("COR:");

        numeroEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroEscorpiao.setText("NÚMERO DA SORTE:");

        javax.swing.GroupLayout areaInformacoesEscorpiaoLayout = new javax.swing.GroupLayout(areaInformacoesEscorpiao);
        areaInformacoesEscorpiao.setLayout(areaInformacoesEscorpiaoLayout);
        areaInformacoesEscorpiaoLayout.setHorizontalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(planetaEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaEscorpiao)
                                .addComponent(tfNumeroEscorpiao)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(elementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfElementoEscorpiao))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(periodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(corEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCorEscorpiao))))
                .addGap(10, 10, 10))
        );
        areaInformacoesEscorpiaoLayout.setVerticalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoEscorpiao)
                    .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoEscorpiao)
                    .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaEscorpiao)
                    .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corEscorpiao)
                    .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroEscorpiao)
                    .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        escorpiao.add(areaInformacoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoEscorpiao.setText("Previsão do Dia:");

        txtPrevisaoEscorpiao.setColumns(20);
        txtPrevisaoEscorpiao.setRows(5);
        txPrevisaoEscorpiao.setViewportView(txtPrevisaoEscorpiao);

        btnAtualizarPrevisaoEscorpiao.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoEscorpiao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisaoEscorpiaoLayout = new javax.swing.GroupLayout(areaPrevisaoEscorpiao);
        areaPrevisaoEscorpiao.setLayout(areaPrevisaoEscorpiaoLayout);
        areaPrevisaoEscorpiaoLayout.setHorizontalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoEscorpiao)
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisaoEscorpiaoLayout.setVerticalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        escorpiao.add(areaPrevisaoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaEscorpiao.setText("Energia do Dia");

        trabalhoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoEscorpiao.setText("Trabalho:");

        sorteEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteEscorpiao.setText("Sorte:");

        amorEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorEscorpiao.setText("Amor:");

        saudeEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeEscorpiao.setText("Saúde:");

        javax.swing.GroupLayout areaEnergiaEscorpiaoLayout = new javax.swing.GroupLayout(areaEnergiaEscorpiao);
        areaEnergiaEscorpiao.setLayout(areaEnergiaEscorpiaoLayout);
        areaEnergiaEscorpiaoLayout.setHorizontalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(amorEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(trabalhoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(saudeEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeEscorpiao)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(sorteEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteEscorpiao)
                    .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergiaEscorpiaoLayout.setVerticalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorEscorpiao)
                .addGap(16, 16, 16)
                .addComponent(trabalhoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeEscorpiao)
                .addGap(15, 15, 15)
                .addComponent(sorteEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteEscorpiao)
                .addGap(51, 51, 51))
        );

        escorpiao.add(areaEnergiaEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemEscorpiao.setText("Mensagem do dia");

        txtMensagemEscorpiao.setColumns(20);
        txtMensagemEscorpiao.setRows(5);
        txMensagemEscorpiao.setViewportView(txtMensagemEscorpiao);

        btnCopiarMsgEscorpiao.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgEscorpiao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemEscorpiaoLayout = new javax.swing.GroupLayout(areaMensagemEscorpiao);
        areaMensagemEscorpiao.setLayout(areaMensagemEscorpiaoLayout);
        areaMensagemEscorpiaoLayout.setHorizontalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagemEscorpiaoLayout.setVerticalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgEscorpiao)
                .addGap(20, 20, 20))
        );

        escorpiao.add(areaMensagemEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));
        escorpiao.add(fundoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Escorpião", escorpiao);

        getContentPane().add(areaAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1730, -1));

        fundoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\PedroLeite\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\Assets\\fundo.jpg!d")); // NOI18N
        getContentPane().add(fundoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 1750, -1));

        gemeos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCaracteristicaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloCaracteristicaGemeos.setText("Características");

        pfortesGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pfortesGemeos.setText("Pontos Fortes:");

        pMelhorarGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pMelhorarGemeos.setText("Pontos a Melhorar:");

        txFortesGemeos.setColumns(20);
        txFortesGemeos.setRows(5);
        jScrollPane5.setViewportView(txFortesGemeos);

        txMelhorarGemeos.setColumns(20);
        txMelhorarGemeos.setRows(5);
        jScrollPane6.setViewportView(txMelhorarGemeos);

        javax.swing.GroupLayout areaCaracteristicas2Layout = new javax.swing.GroupLayout(areaCaracteristicas2);
        areaCaracteristicas2.setLayout(areaCaracteristicas2Layout);
        areaCaracteristicas2Layout.setHorizontalGroup(
            areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCaracteristicaGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(pfortesGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(pMelhorarGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addGap(26, 26, 26))
        );
        areaCaracteristicas2Layout.setVerticalGroup(
            areaCaracteristicas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pfortesGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6)
                .addGap(27, 27, 27))
        );

        gemeos.add(areaCaracteristicas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 520, 460));

        tituloGemeos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloGemeos.setText("Gêmeos");

        periodoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        periodoGemeos.setText("PERIODO:");

        elementoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        elementoGemeos.setText("ELEMENTO:");

        planetaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        planetaGemeos.setText("PLANETA REGENTE:");

        corGemeos.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        corGemeos.setText("COR:");

        numeroGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroGemeos.setText("NÚMERO DA SORTE:");

        javax.swing.GroupLayout areaInformacoes2Layout = new javax.swing.GroupLayout(areaInformacoes2);
        areaInformacoes2.setLayout(areaInformacoes2Layout);
        areaInformacoes2Layout.setHorizontalGroup(
            areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgSignoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(areaInformacoes2Layout.createSequentialGroup()
                                    .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(planetaGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numeroGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfPlanetaAries2)
                                        .addComponent(tfNumeroAries2)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes2Layout.createSequentialGroup()
                                    .addComponent(elementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfElementoAries2))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes2Layout.createSequentialGroup()
                                    .addComponent(periodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfPeriodoAries2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(areaInformacoes2Layout.createSequentialGroup()
                                    .addComponent(corGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfCorAries2))))))
                .addGap(1762, 1762, 1762))
        );
        areaInformacoes2Layout.setVerticalGroup(
            areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(tituloGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoGemeos)
                    .addComponent(tfPeriodoAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoGemeos)
                    .addComponent(tfElementoAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaGemeos)
                    .addComponent(tfPlanetaAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corGemeos)
                    .addComponent(tfCorAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroGemeos)
                    .addComponent(tfNumeroAries2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        gemeos.add(areaInformacoes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 410, 910));

        previsaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        previsaoGemeos.setText("Previsão do Dia:");

        txtPrevisaoGemeos.setColumns(20);
        txtPrevisaoGemeos.setRows(5);
        txPrevisaoAries2.setViewportView(txtPrevisaoGemeos);

        btnAtualizarPrevisaoGemeos.setBackground(new java.awt.Color(0, 0, 51));
        btnAtualizarPrevisaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizarPrevisaoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisaoGemeos.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisao2Layout = new javax.swing.GroupLayout(areaPrevisao2);
        areaPrevisao2.setLayout(areaPrevisao2Layout);
        areaPrevisao2Layout.setHorizontalGroup(
            areaPrevisao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(areaPrevisao2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(previsaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                    .addComponent(txPrevisaoAries2)
                    .addGroup(areaPrevisao2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        areaPrevisao2Layout.setVerticalGroup(
            areaPrevisao2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisao2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisaoAries2, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        gemeos.add(areaPrevisao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 520, 420));

        tituloEnergiaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloEnergiaGemeos.setText("Energia do Dia");

        trabalhoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        trabalhoGemeos.setText("Trabalho:");

        sorteGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sorteGemeos.setText("Sorte:");

        amorGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        amorGemeos.setText("Amor:");

        saudeGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saudeGemeos.setText("Saúde:");

        javax.swing.GroupLayout areaEnergia2Layout = new javax.swing.GroupLayout(areaEnergia2);
        areaEnergia2.setLayout(areaEnergia2Layout);
        areaEnergia2Layout.setHorizontalGroup(
            areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(amorGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfAmorGemeos)
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(trabalhoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(373, 373, 373))
                    .addComponent(tfTrabalhoGemeos)
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(saudeGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSaudeGemeos)
                    .addGroup(areaEnergia2Layout.createSequentialGroup()
                        .addComponent(sorteGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(433, 433, 433))
                    .addComponent(tfSorteGemeos)
                    .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        areaEnergia2Layout.setVerticalGroup(
            areaEnergia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amorGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorGemeos)
                .addGap(16, 16, 16)
                .addComponent(trabalhoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tfTrabalhoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeGemeos)
                .addGap(15, 15, 15)
                .addComponent(sorteGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteGemeos)
                .addGap(51, 51, 51))
        );

        gemeos.add(areaEnergia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 570, 460));

        tituloMensagemGemeos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tituloMensagemGemeos.setText("Mensagem do dia");

        txtMensagemGemeos.setColumns(20);
        txtMensagemGemeos.setRows(5);
        txMensagemGemeos.setViewportView(txtMensagemGemeos);

        btnCopiarMsgGemeos.setBackground(new java.awt.Color(0, 0, 51));
        btnCopiarMsgGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgGemeos.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem2Layout = new javax.swing.GroupLayout(areaMensagem2);
        areaMensagem2.setLayout(areaMensagem2Layout);
        areaMensagem2Layout.setHorizontalGroup(
            areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarMsgGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        areaMensagem2Layout.setVerticalGroup(
            areaMensagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txMensagemGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgGemeos)
                .addGap(20, 20, 20))
        );

        gemeos.add(areaMensagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 540, 420));

        getContentPane().add(gemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 130, 1730, 1010));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Signos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amorAquario;
    private javax.swing.JLabel amorAries;
    private javax.swing.JLabel amorAries9;
    private javax.swing.JLabel amorCancer;
    private javax.swing.JLabel amorEscorpiao;
    private javax.swing.JLabel amorGemeos;
    private javax.swing.JLabel amorLeao;
    private javax.swing.JLabel amorLibra;
    private javax.swing.JLabel amorPeixes;
    private javax.swing.JLabel amorSagitario;
    private javax.swing.JLabel amorTouro;
    private javax.swing.JLabel amorVirgem;
    private javax.swing.JPanel aquario;
    private javax.swing.JTabbedPane areaAbas;
    private javax.swing.JPanel areaCapricornio;
    private javax.swing.JPanel areaCaracteristicas;
    private javax.swing.JPanel areaCaracteristicas1;
    private javax.swing.JPanel areaCaracteristicas11;
    private javax.swing.JPanel areaCaracteristicas2;
    private javax.swing.JPanel areaCaracteristicas3;
    private javax.swing.JPanel areaCaracteristicas4;
    private javax.swing.JPanel areaCaracteristicas5;
    private javax.swing.JPanel areaCaracteristicas6;
    private javax.swing.JPanel areaCaracteristicasAquario;
    private javax.swing.JPanel areaCaracteristicasCapricornio;
    private javax.swing.JPanel areaCaracteristicasEscorpiao;
    private javax.swing.JPanel areaCaracteristicasSagitario;
    private javax.swing.JPanel areaCompatibilidade;
    private javax.swing.JPanel areaDescobrirSigno;
    private javax.swing.JPanel areaEnergia;
    private javax.swing.JPanel areaEnergia1;
    private javax.swing.JPanel areaEnergia11;
    private javax.swing.JPanel areaEnergia2;
    private javax.swing.JPanel areaEnergia3;
    private javax.swing.JPanel areaEnergia4;
    private javax.swing.JPanel areaEnergia5;
    private javax.swing.JPanel areaEnergiaAquario;
    private javax.swing.JPanel areaEnergiaEscorpiao;
    private javax.swing.JPanel areaEnergiaLibra;
    private javax.swing.JPanel areaEnergiaSagitario;
    private javax.swing.JPanel areaInformacoes;
    private javax.swing.JPanel areaInformacoes1;
    private javax.swing.JPanel areaInformacoes11;
    private javax.swing.JPanel areaInformacoes2;
    private javax.swing.JPanel areaInformacoes3;
    private javax.swing.JPanel areaInformacoes4;
    private javax.swing.JPanel areaInformacoes5;
    private javax.swing.JPanel areaInformacoesAquario;
    private javax.swing.JPanel areaInformacoesCapricornio;
    private javax.swing.JPanel areaInformacoesEscorpiao;
    private javax.swing.JPanel areaInformacoesLibra;
    private javax.swing.JPanel areaInformacoesSagitario;
    private javax.swing.JPanel areaMensagem;
    private javax.swing.JPanel areaMensagem1;
    private javax.swing.JPanel areaMensagem11;
    private javax.swing.JPanel areaMensagem2;
    private javax.swing.JPanel areaMensagem3;
    private javax.swing.JPanel areaMensagem5;
    private javax.swing.JPanel areaMensagemAquario;
    private javax.swing.JPanel areaMensagemCapricornio;
    private javax.swing.JPanel areaMensagemEscorpiao;
    private javax.swing.JPanel areaMensagemLeao;
    private javax.swing.JPanel areaMensagemLibra;
    private javax.swing.JPanel areaMensagemSagitario;
    private javax.swing.JPanel areaPrevisao;
    private javax.swing.JPanel areaPrevisao1;
    private javax.swing.JPanel areaPrevisao11;
    private javax.swing.JPanel areaPrevisao2;
    private javax.swing.JPanel areaPrevisao3;
    private javax.swing.JPanel areaPrevisao4;
    private javax.swing.JPanel areaPrevisao5;
    private javax.swing.JPanel areaPrevisaoAquario;
    private javax.swing.JPanel areaPrevisaoCapricornio;
    private javax.swing.JPanel areaPrevisaoEscorpiao;
    private javax.swing.JPanel areaPrevisaoLibra;
    private javax.swing.JPanel areaPrevisaoSagitario;
    private javax.swing.JPanel areaResultado;
    private javax.swing.JPanel aries;
    private javax.swing.JButton btnAtualizarPrevisaoAquario;
    private javax.swing.JButton btnAtualizarPrevisaoAries;
    private javax.swing.JButton btnAtualizarPrevisaoCancer;
    private javax.swing.JButton btnAtualizarPrevisaoCapricornio;
    private javax.swing.JButton btnAtualizarPrevisaoEscorpiao;
    private javax.swing.JButton btnAtualizarPrevisaoGemeos;
    private javax.swing.JButton btnAtualizarPrevisaoLeao;
    private javax.swing.JButton btnAtualizarPrevisaoLibra;
    private javax.swing.JButton btnAtualizarPrevisaoPeixes;
    private javax.swing.JButton btnAtualizarPrevisaoSagitario;
    private javax.swing.JButton btnAtualizarPrevisaoTouro;
    private javax.swing.JButton btnAtualizarPrevisaoVirgem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCopiarMsgAquario;
    private javax.swing.JButton btnCopiarMsgAries;
    private javax.swing.JButton btnCopiarMsgCancer;
    private javax.swing.JButton btnCopiarMsgCapricornio;
    private javax.swing.JButton btnCopiarMsgEscorpiao;
    private javax.swing.JButton btnCopiarMsgGemeos;
    private javax.swing.JButton btnCopiarMsgLeao;
    private javax.swing.JButton btnCopiarMsgLibra;
    private javax.swing.JButton btnCopiarMsgPeixes;
    private javax.swing.JButton btnCopiarMsgSagitario;
    private javax.swing.JButton btnCopiarMsgTouro;
    private javax.swing.JButton btnCopiarMsgVirgem;
    private javax.swing.JButton btnDescobrirSigno;
    private javax.swing.JPanel cancer;
    private javax.swing.JPanel capricornio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbSigno1;
    private javax.swing.JComboBox<String> cbSigno2;
    private javax.swing.JLabel compatibilidade;
    private javax.swing.JLabel corAquario;
    private javax.swing.JLabel corAries;
    private javax.swing.JLabel corAries11;
    private javax.swing.JLabel corAriesCapricornio;
    private javax.swing.JLabel corCancer;
    private javax.swing.JLabel corEscorpiao;
    private javax.swing.JLabel corGemeos;
    private javax.swing.JLabel corLeao;
    private javax.swing.JLabel corLibra;
    private javax.swing.JLabel corSagitario;
    private javax.swing.JLabel corTouro;
    private javax.swing.JLabel corVirgem;
    private javax.swing.JLabel diaNascimento;
    private javax.swing.JLabel elementoAquario;
    private javax.swing.JLabel elementoAries;
    private javax.swing.JLabel elementoAries11;
    private javax.swing.JLabel elementoAriesCapricornio;
    private javax.swing.JLabel elementoCancer;
    private javax.swing.JLabel elementoEscorpiao;
    private javax.swing.JLabel elementoGemeos;
    private javax.swing.JLabel elementoLeao;
    private javax.swing.JLabel elementoLibra;
    private javax.swing.JLabel elementoSagitario;
    private javax.swing.JLabel elementoTouro;
    private javax.swing.JLabel elementoVirgem;
    private javax.swing.JPanel escorpiao;
    private javax.swing.JLabel fundoAquario;
    private javax.swing.JLabel fundoAries;
    private javax.swing.JLabel fundoCancer;
    private javax.swing.JLabel fundoCapricornio;
    private javax.swing.JLabel fundoEscorpiao;
    private javax.swing.JLabel fundoGemeos;
    private javax.swing.JLabel fundoInicio;
    private javax.swing.JLabel fundoLeao;
    private javax.swing.JLabel fundoLibra;
    private javax.swing.JLabel fundoPeixes;
    private javax.swing.JLabel fundoSagitario;
    private javax.swing.JLabel fundoTouro;
    private javax.swing.JLabel fundoVirgem;
    private javax.swing.JPanel gemeos;
    private javax.swing.JButton imgSigno;
    private javax.swing.JLabel imgSignoAquario;
    private javax.swing.JLabel imgSignoAries;
    private javax.swing.JLabel imgSignoCancer;
    private javax.swing.JLabel imgSignoCapricornio;
    private javax.swing.JLabel imgSignoEscorpiao;
    private javax.swing.JLabel imgSignoGemeos;
    private javax.swing.JLabel imgSignoLeao;
    private javax.swing.JLabel imgSignoLibra;
    private javax.swing.JLabel imgSignoPeixes;
    private javax.swing.JLabel imgSignoSagitario;
    private javax.swing.JLabel imgSignoTouro;
    private javax.swing.JLabel imgSignoVirgem;
    private javax.swing.JPanel inicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel leao;
    private javax.swing.JPanel libra;
    private javax.swing.JLabel mesNascimento;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numeroAquario;
    private javax.swing.JLabel numeroAries;
    private javax.swing.JLabel numeroAries11;
    private javax.swing.JLabel numeroAriesCapricornio;
    private javax.swing.JLabel numeroCancer;
    private javax.swing.JLabel numeroEscorpiao;
    private javax.swing.JLabel numeroGemeos;
    private javax.swing.JLabel numeroLeao;
    private javax.swing.JLabel numeroLibra;
    private javax.swing.JLabel numeroSagitario;
    private javax.swing.JLabel numeroTouro;
    private javax.swing.JLabel numeroVirgem;
    private javax.swing.JLabel pMelhorarAquario;
    private javax.swing.JLabel pMelhorarAries;
    private javax.swing.JLabel pMelhorarAries11;
    private javax.swing.JLabel pMelhorarCancer;
    private javax.swing.JLabel pMelhorarCapricornio;
    private javax.swing.JLabel pMelhorarEscorpiao;
    private javax.swing.JLabel pMelhorarGemeos;
    private javax.swing.JLabel pMelhorarLeao;
    private javax.swing.JLabel pMelhorarLibra;
    private javax.swing.JLabel pMelhorarSagitario;
    private javax.swing.JLabel pMelhorarTouro;
    private javax.swing.JLabel pMelhorarVirgem;
    private javax.swing.JPanel peixes;
    private javax.swing.JLabel periodoAquario;
    private javax.swing.JLabel periodoAries;
    private javax.swing.JLabel periodoAries11;
    private javax.swing.JLabel periodoAriesCapricornio;
    private javax.swing.JLabel periodoAriesSagitario;
    private javax.swing.JLabel periodoCancer;
    private javax.swing.JLabel periodoEscorpiao;
    private javax.swing.JLabel periodoGemeos;
    private javax.swing.JLabel periodoLeao;
    private javax.swing.JLabel periodoLibra;
    private javax.swing.JLabel periodoTouro;
    private javax.swing.JLabel periodoVirgem;
    private javax.swing.JLabel pfortesAquario;
    private javax.swing.JLabel pfortesAries;
    private javax.swing.JLabel pfortesAries11;
    private javax.swing.JLabel pfortesCancer;
    private javax.swing.JLabel pfortesCapricornio;
    private javax.swing.JLabel pfortesEscorpiao;
    private javax.swing.JLabel pfortesGemeos;
    private javax.swing.JLabel pfortesLeao;
    private javax.swing.JLabel pfortesLibra;
    private javax.swing.JLabel pfortesSagitario;
    private javax.swing.JLabel pfortesTouro;
    private javax.swing.JLabel pfortesVirgem;
    private javax.swing.JLabel planetaAquario;
    private javax.swing.JLabel planetaAries;
    private javax.swing.JLabel planetaAries11;
    private javax.swing.JLabel planetaAriesCapricornio;
    private javax.swing.JLabel planetaCancer;
    private javax.swing.JLabel planetaEscorpiao;
    private javax.swing.JLabel planetaGemeos;
    private javax.swing.JLabel planetaLeao;
    private javax.swing.JLabel planetaLibra;
    private javax.swing.JLabel planetaSagitario;
    private javax.swing.JLabel planetaTouro;
    private javax.swing.JLabel planetaVirgem;
    private javax.swing.JLabel previsaoAquario;
    private javax.swing.JLabel previsaoAries;
    private javax.swing.JLabel previsaoCancer;
    private javax.swing.JLabel previsaoCapricornio;
    private javax.swing.JLabel previsaoEscorpiao;
    private javax.swing.JLabel previsaoGemeos;
    private javax.swing.JLabel previsaoLeao;
    private javax.swing.JLabel previsaoLibra;
    private javax.swing.JLabel previsaoPeixes;
    private javax.swing.JLabel previsaoSagitario;
    private javax.swing.JLabel previsaoTouro;
    private javax.swing.JLabel previsaoVirgem;
    private javax.swing.JPanel sagitario;
    private javax.swing.JLabel saudeAquario;
    private javax.swing.JLabel saudeAries;
    private javax.swing.JLabel saudeAries9;
    private javax.swing.JLabel saudeCancer;
    private javax.swing.JLabel saudeEscorpiao;
    private javax.swing.JLabel saudeGemeos;
    private javax.swing.JLabel saudeLeao;
    private javax.swing.JLabel saudeLibra;
    private javax.swing.JLabel saudePeixes;
    private javax.swing.JLabel saudeSagitario;
    private javax.swing.JLabel saudeTouro;
    private javax.swing.JLabel saudeVirgem;
    private javax.swing.JLabel signo;
    private javax.swing.JLabel signo1;
    private javax.swing.JLabel signo2;
    private javax.swing.JLabel sorteAquario;
    private javax.swing.JLabel sorteAries;
    private javax.swing.JLabel sorteAries9;
    private javax.swing.JLabel sorteCancer;
    private javax.swing.JLabel sorteEscorpiao;
    private javax.swing.JLabel sorteGemeos;
    private javax.swing.JLabel sorteLeao;
    private javax.swing.JLabel sorteLibra;
    private javax.swing.JLabel sortePeixes;
    private javax.swing.JLabel sorteSagitario;
    private javax.swing.JLabel sorteTouro;
    private javax.swing.JLabel sorteVirgem;
    private javax.swing.JTextField tfAmorAquario;
    private javax.swing.JTextField tfAmorAries;
    private javax.swing.JTextField tfAmorAries1;
    private javax.swing.JTextField tfAmorAries9;
    private javax.swing.JTextField tfAmorCancer;
    private javax.swing.JTextField tfAmorEscorpiao;
    private javax.swing.JTextField tfAmorGemeos;
    private javax.swing.JTextField tfAmorLeao;
    private javax.swing.JTextField tfAmorLibra;
    private javax.swing.JTextField tfAmorPeixes;
    private javax.swing.JTextField tfAmorSagitario;
    private javax.swing.JTextField tfAmorVirgem;
    private javax.swing.JTextField tfCompatibilidade;
    private javax.swing.JTextField tfCorAquario;
    private javax.swing.JTextField tfCorAries;
    private javax.swing.JTextField tfCorAries11;
    private javax.swing.JTextField tfCorAries2;
    private javax.swing.JTextField tfCorAriesCapricornio;
    private javax.swing.JTextField tfCorCancer;
    private javax.swing.JTextField tfCorEscorpiao;
    private javax.swing.JTextField tfCorLeao;
    private javax.swing.JTextField tfCorLibra;
    private javax.swing.JTextField tfCorSagitario;
    private javax.swing.JTextField tfCorTouro;
    private javax.swing.JTextField tfCorVirgem;
    private javax.swing.JTextField tfElementoAquario;
    private javax.swing.JTextField tfElementoAries;
    private javax.swing.JTextField tfElementoAries11;
    private javax.swing.JTextField tfElementoAries2;
    private javax.swing.JTextField tfElementoAriesCapricornio;
    private javax.swing.JTextField tfElementoCancer;
    private javax.swing.JTextField tfElementoEscorpiao;
    private javax.swing.JTextField tfElementoLeao;
    private javax.swing.JTextField tfElementoLibra;
    private javax.swing.JTextField tfElementoSagitario;
    private javax.swing.JTextField tfElementoTouro;
    private javax.swing.JTextField tfElementoVirgem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroAquario;
    private javax.swing.JTextField tfNumeroAries;
    private javax.swing.JTextField tfNumeroAries11;
    private javax.swing.JTextField tfNumeroAries2;
    private javax.swing.JTextField tfNumeroAriesCapricornio;
    private javax.swing.JTextField tfNumeroCancer;
    private javax.swing.JTextField tfNumeroEscorpiao;
    private javax.swing.JTextField tfNumeroLeao;
    private javax.swing.JTextField tfNumeroLibra;
    private javax.swing.JTextField tfNumeroSagitario;
    private javax.swing.JTextField tfNumeroTouro;
    private javax.swing.JTextField tfNumeroVirgem;
    private javax.swing.JTextField tfPeriodoAquario;
    private javax.swing.JTextField tfPeriodoAries;
    private javax.swing.JTextField tfPeriodoAries11;
    private javax.swing.JTextField tfPeriodoAries2;
    private javax.swing.JTextField tfPeriodoAriesCapricornio;
    private javax.swing.JTextField tfPeriodoCancer;
    private javax.swing.JTextField tfPeriodoEscorpiao;
    private javax.swing.JTextField tfPeriodoLeao;
    private javax.swing.JTextField tfPeriodoLibra;
    private javax.swing.JTextField tfPeriodoSagitario;
    private javax.swing.JTextField tfPeriodoTouro;
    private javax.swing.JTextField tfPeriodoVirgem;
    private javax.swing.JTextField tfPlanetaAquario;
    private javax.swing.JTextField tfPlanetaAries;
    private javax.swing.JTextField tfPlanetaAries11;
    private javax.swing.JTextField tfPlanetaAries2;
    private javax.swing.JTextField tfPlanetaAriesCapricornio;
    private javax.swing.JTextField tfPlanetaCancer;
    private javax.swing.JTextField tfPlanetaEscorpiao;
    private javax.swing.JTextField tfPlanetaLeao;
    private javax.swing.JTextField tfPlanetaLibra;
    private javax.swing.JTextField tfPlanetaSagitario;
    private javax.swing.JTextField tfPlanetaTouro;
    private javax.swing.JTextField tfPlanetaVirgem;
    private javax.swing.JTextField tfSaudeAquario;
    private javax.swing.JTextField tfSaudeAries;
    private javax.swing.JTextField tfSaudeAries1;
    private javax.swing.JTextField tfSaudeAries9;
    private javax.swing.JTextField tfSaudeCancer;
    private javax.swing.JTextField tfSaudeEscorpiao;
    private javax.swing.JTextField tfSaudeGemeos;
    private javax.swing.JTextField tfSaudeLeao;
    private javax.swing.JTextField tfSaudeLibra;
    private javax.swing.JTextField tfSaudePeixes;
    private javax.swing.JTextField tfSaudeSagitario;
    private javax.swing.JTextField tfSaudeVirgem;
    private javax.swing.JTextField tfSorteAquario;
    private javax.swing.JTextField tfSorteAries;
    private javax.swing.JTextField tfSorteAries1;
    private javax.swing.JTextField tfSorteAries9;
    private javax.swing.JTextField tfSorteCancer;
    private javax.swing.JTextField tfSorteEscorpiao;
    private javax.swing.JTextField tfSorteGemeos;
    private javax.swing.JTextField tfSorteLeao;
    private javax.swing.JTextField tfSorteLibra;
    private javax.swing.JTextField tfSortePeixes;
    private javax.swing.JTextField tfSorteSagitario;
    private javax.swing.JTextField tfSorteVirgem;
    private javax.swing.JTextField tfTrabalhoAquario;
    private javax.swing.JTextField tfTrabalhoAries;
    private javax.swing.JTextField tfTrabalhoAries1;
    private javax.swing.JTextField tfTrabalhoAries9;
    private javax.swing.JTextField tfTrabalhoCancer;
    private javax.swing.JTextField tfTrabalhoEscorpiao;
    private javax.swing.JTextField tfTrabalhoGemeos;
    private javax.swing.JTextField tfTrabalhoLeao;
    private javax.swing.JTextField tfTrabalhoLibra;
    private javax.swing.JTextField tfTrabalhoPeixes;
    private javax.swing.JTextField tfTrabalhoSagitario;
    private javax.swing.JTextField tfTrabalhoVirgem;
    private javax.swing.JLabel tituloAquario;
    private javax.swing.JLabel tituloAries;
    private javax.swing.JLabel tituloAries11;
    private javax.swing.JLabel tituloAriesCapricornio;
    private javax.swing.JLabel tituloAriesSagitario;
    private javax.swing.JLabel tituloCancer;
    private javax.swing.JLabel tituloCaracteristicaAquario;
    private javax.swing.JLabel tituloCaracteristicaAries;
    private javax.swing.JLabel tituloCaracteristicaAries11;
    private javax.swing.JLabel tituloCaracteristicaCancer;
    private javax.swing.JLabel tituloCaracteristicaCapricornio;
    private javax.swing.JLabel tituloCaracteristicaEscorpiao;
    private javax.swing.JLabel tituloCaracteristicaGemeos;
    private javax.swing.JLabel tituloCaracteristicaLeao;
    private javax.swing.JLabel tituloCaracteristicaLibra;
    private javax.swing.JLabel tituloCaracteristicaSagitario;
    private javax.swing.JLabel tituloCaracteristicaTouro;
    private javax.swing.JLabel tituloCaracteristicaVirgem;
    private javax.swing.JLabel tituloCompatibilidade;
    private javax.swing.JLabel tituloDescobrirSigno;
    private javax.swing.JLabel tituloEnergiaAquario;
    private javax.swing.JLabel tituloEnergiaAries;
    private javax.swing.JLabel tituloEnergiaAries9;
    private javax.swing.JLabel tituloEnergiaCancer;
    private javax.swing.JLabel tituloEnergiaEscorpiao;
    private javax.swing.JLabel tituloEnergiaGemeos;
    private javax.swing.JLabel tituloEnergiaLeao;
    private javax.swing.JLabel tituloEnergiaLibra;
    private javax.swing.JLabel tituloEnergiaPeixes;
    private javax.swing.JLabel tituloEnergiaSagitario;
    private javax.swing.JLabel tituloEnergiaTouro;
    private javax.swing.JLabel tituloEnergiaVirgem;
    private javax.swing.JLabel tituloEscorpiao;
    private javax.swing.JLabel tituloGemeos;
    private javax.swing.JLabel tituloLeao;
    private javax.swing.JLabel tituloLibra;
    private javax.swing.JLabel tituloMensagemAquario;
    private javax.swing.JLabel tituloMensagemAries;
    private javax.swing.JLabel tituloMensagemCancer;
    private javax.swing.JLabel tituloMensagemCapricornio;
    private javax.swing.JLabel tituloMensagemEscorpiao;
    private javax.swing.JLabel tituloMensagemGemeos;
    private javax.swing.JLabel tituloMensagemLeao;
    private javax.swing.JLabel tituloMensagemLibra;
    private javax.swing.JLabel tituloMensagemPeixes;
    private javax.swing.JLabel tituloMensagemSagitario;
    private javax.swing.JLabel tituloMensagemTouro;
    private javax.swing.JLabel tituloMensagemVirgem;
    private javax.swing.JLabel tituloTouro;
    private javax.swing.JLabel tituloVirgem;
    private javax.swing.JPanel touro;
    private javax.swing.JLabel trabalhoAquario;
    private javax.swing.JLabel trabalhoAries;
    private javax.swing.JLabel trabalhoAries9;
    private javax.swing.JLabel trabalhoCancer;
    private javax.swing.JLabel trabalhoEscorpiao;
    private javax.swing.JLabel trabalhoGemeos;
    private javax.swing.JLabel trabalhoLeao;
    private javax.swing.JLabel trabalhoLibra;
    private javax.swing.JLabel trabalhoPeixes;
    private javax.swing.JLabel trabalhoSagitario;
    private javax.swing.JLabel trabalhoTouro;
    private javax.swing.JLabel trabalhoVirgem;
    private javax.swing.JTextArea txFortesAquario;
    private javax.swing.JTextArea txFortesAries;
    private javax.swing.JTextArea txFortesAries11;
    private javax.swing.JTextArea txFortesCancer;
    private javax.swing.JTextArea txFortesCapricornio;
    private javax.swing.JTextArea txFortesEscorpiao;
    private javax.swing.JTextArea txFortesGemeos;
    private javax.swing.JTextArea txFortesLeao;
    private javax.swing.JTextArea txFortesLibra;
    private javax.swing.JTextArea txFortesSagitario;
    private javax.swing.JTextArea txFortesTouro;
    private javax.swing.JTextArea txFortesVirgem;
    private javax.swing.JTextArea txMelhorarAquario;
    private javax.swing.JTextArea txMelhorarAries;
    private javax.swing.JTextArea txMelhorarAries11;
    private javax.swing.JTextArea txMelhorarCancer;
    private javax.swing.JTextArea txMelhorarCapricornio;
    private javax.swing.JTextArea txMelhorarEscorpiao;
    private javax.swing.JTextArea txMelhorarGemeos;
    private javax.swing.JTextArea txMelhorarLeao;
    private javax.swing.JTextArea txMelhorarLibra;
    private javax.swing.JTextArea txMelhorarSagitario;
    private javax.swing.JTextArea txMelhorarTouro;
    private javax.swing.JTextArea txMelhorarVirgem;
    private javax.swing.JScrollPane txMensagemAries;
    private javax.swing.JScrollPane txMensagemAries10;
    private javax.swing.JScrollPane txMensagemAries4;
    private javax.swing.JScrollPane txMensagemAries8;
    private javax.swing.JScrollPane txMensagemAries9;
    private javax.swing.JScrollPane txMensagemCancer;
    private javax.swing.JScrollPane txMensagemEscorpiao;
    private javax.swing.JScrollPane txMensagemGemeos;
    private javax.swing.JScrollPane txMensagemLibra;
    private javax.swing.JScrollPane txMensagemPeixes;
    private javax.swing.JScrollPane txMensagemTouro;
    private javax.swing.JScrollPane txMensagemVirgem;
    private javax.swing.JScrollPane txPrevisaoAries;
    private javax.swing.JScrollPane txPrevisaoAries10;
    private javax.swing.JScrollPane txPrevisaoAries2;
    private javax.swing.JScrollPane txPrevisaoAries4;
    private javax.swing.JScrollPane txPrevisaoAries8;
    private javax.swing.JScrollPane txPrevisaoAries9;
    private javax.swing.JScrollPane txPrevisaoCancer;
    private javax.swing.JScrollPane txPrevisaoEscorpiao;
    private javax.swing.JScrollPane txPrevisaoLibra;
    private javax.swing.JScrollPane txPrevisaoPeixes;
    private javax.swing.JScrollPane txPrevisaoTouro;
    private javax.swing.JScrollPane txPrevisaoVirgem;
    private javax.swing.JTextArea txtMensagemAquario;
    private javax.swing.JTextArea txtMensagemAries;
    private javax.swing.JTextArea txtMensagemCancer;
    private javax.swing.JTextArea txtMensagemCapricornio;
    private javax.swing.JTextArea txtMensagemEscorpiao;
    private javax.swing.JTextArea txtMensagemGemeos;
    private javax.swing.JTextArea txtMensagemLeao;
    private javax.swing.JTextArea txtMensagemLibra;
    private javax.swing.JTextArea txtMensagemPeixes;
    private javax.swing.JTextArea txtMensagemSagitario;
    private javax.swing.JTextArea txtMensagemTouro;
    private javax.swing.JTextArea txtMensagemVirgem;
    private javax.swing.JTextArea txtPrevisaoAquario;
    private javax.swing.JTextArea txtPrevisaoAries;
    private javax.swing.JTextArea txtPrevisaoCancer;
    private javax.swing.JTextArea txtPrevisaoCapricornio;
    private javax.swing.JTextArea txtPrevisaoEscorpiao;
    private javax.swing.JTextArea txtPrevisaoGemeos;
    private javax.swing.JTextArea txtPrevisaoLeao;
    private javax.swing.JTextArea txtPrevisaoLibra;
    private javax.swing.JTextArea txtPrevisaoPeixes;
    private javax.swing.JTextArea txtPrevisaoSagitario;
    private javax.swing.JTextArea txtPrevisaoTouro;
    private javax.swing.JTextArea txtPrevisaoVirgem;
    private javax.swing.JPanel virgem;
    // End of variables declaration//GEN-END:variables
}
